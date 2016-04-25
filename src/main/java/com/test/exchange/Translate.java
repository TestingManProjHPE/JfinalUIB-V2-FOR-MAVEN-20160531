package com.test.exchange;

import java.io.IOException;
import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.test.mvc.requirements.Requirements;

public class Translate {

	private String baseUrl = "http://192.168.5.130:8080/qcbin/";
	private String username = "almtest";
	private String password = "password";

	AlmRestfulServiceImpl almService = new AlmRestfulServiceImpl(baseUrl);

	Object[][] sqlPara = new Object[30][5];

	public void importData() {
		// TODO 拆成鉴权,获取domains,获取其他数据
		try {

			almService.setUsername(username);
			almService.setPassword(password);

			almService.login();
			almService.sitSession();

			Domains domains = almService.getDomains();
			Domain domain = domains.getList().get(0);

			almService.setDomain(domain.getName());
			almService.setProject(domain.getProjects().getProject().getName());

			for (Entity entity : almService.getRequirements().getList()) {
				// System.out.println(entity.getChildrenCount().getValue());

				for (int j = 0; j < entity.getList().size(); j++) {
					for (int i = 0; i < entity.getList().get(j).getField().size(); i++) {
						Field field = entity.getList().get(j).getField().get(i);
						// System.out.println(field.getName() + " : " +
						// field.getValue());
						switch (field.getName()) {
						case "id":
							sqlPara[j][0] = field.getValue();
						case "last-modified":
							sqlPara[j][1] = field.getValue();
						case "owner":
							sqlPara[j][2] = field.getValue();
						case "req-product":
							sqlPara[j][3] = field.getValue();
						case "target-rcyc":
							sqlPara[j][4] = field.getValue();
						default:
							;
						}
					}
				}

				System.out.println(sqlPara[0][0] + ", " + sqlPara[0][1] + ", " + sqlPara[0][2] + ", " + sqlPara[0][3]
						+ ", " + sqlPara[0][4]);

			}

//			String sql = "insert into requirements(req_sn, creationdate, author, product_name, targetcycle) values(?, ?, ?, ?, ?)";
//			Db.batch(sql, sqlPara, 1000);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Translate translate = new Translate();
		translate.importData();
	}

}
