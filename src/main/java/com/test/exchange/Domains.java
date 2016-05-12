package com.test.exchange;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Domains {

	@ElementList(inline = true)
	private List<Domain> list;

	public List<Domain> getList() {
		return list;
	}

	public void setList(List<Domain> list) {
		this.list = list;
	}

}

@Root(name = "Domain")
class Domain {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Projects getProjects() {
		return projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	@Attribute(name = "Name")
	private String name;

	@Element(name = "Projects")
	private Projects projects;
}

@Root
class Projects {
	
	@ElementList(inline = true)
	private List<Project> list;

	public List<Project> getList() {
		return list;
	}

	public void setList(List<Project> list) {
		this.list = list;
	}
	
}

@Root(name = "Project")
class Project {
	@Attribute(name = "Name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
