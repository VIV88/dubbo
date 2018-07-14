package org.dubbo.provider.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dubbo.api.service.DomoService;

public class DemoServiceImpl implements DomoService {

	public List<String> getStr(Long id) {
		List<String> result = new ArrayList<String>();
		result.add(id-1+"");
		result.add(id+"");
		result.add(id+1+"");
		return result;
	}

}
