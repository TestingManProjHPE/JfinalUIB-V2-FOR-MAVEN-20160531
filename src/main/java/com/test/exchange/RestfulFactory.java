package com.test.exchange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RestfulFactory {
	
	// 需要访问的rest服务器基础路径
	private String baseUrl;
	
	// 实现cookie的自动管理功能，CookieJar类中重载saveFromResponse方法和loadForRequest方法
	static OkHttpClient client = new OkHttpClient.Builder().cookieJar(new CookieJar() {
		private final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();

		@Override
		public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
			String urlKey = url.host() + ":" + url.port();
			List<Cookie> tempCookies = new ArrayList<Cookie>();
			// 需要添加 cookie 失效
			if (cookieStore.containsKey(urlKey)) {
				tempCookies.addAll(cookieStore.get(urlKey));

				for (Cookie cookie : cookies) {
					for (Cookie tempCookie : tempCookies) {
						if (tempCookie.name().equals(cookie.name())) {
							tempCookies.remove(tempCookie);
							break;
						}
					}
				}
			}

			tempCookies.addAll(cookies);
			cookieStore.put(urlKey, tempCookies);
		}

		@Override
		public List<Cookie> loadForRequest(HttpUrl url) {
			String urlKey = url.host() + ":" + url.port();
			List<Cookie> cookies = cookieStore.get(urlKey);
			System.out.println("load : " + url.host() + " - " + cookies);
			return cookies != null ? cookies : new ArrayList<Cookie>();
		}
	}).build();


	public RestfulFactory(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public AlmRestfulService getXmlService() {
		Retrofit xmlRetrofit = new Retrofit.Builder().baseUrl(baseUrl)
				.addConverterFactory(SimpleXmlConverterFactory.create()).client(client).build();

		AlmRestfulService service = xmlRetrofit.create(AlmRestfulService.class);
		return service;
	}

	public AlmRestfulService getScalarsService() {
		Retrofit scalarsRetrofit = new Retrofit.Builder().baseUrl(baseUrl)
				.addConverterFactory(ScalarsConverterFactory.create()).client(client).build();

		AlmRestfulService service = scalarsRetrofit.create(AlmRestfulService.class);
		return service;
	}

}
