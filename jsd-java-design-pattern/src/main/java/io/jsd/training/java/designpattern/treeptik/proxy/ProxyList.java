package io.jsd.training.java.designpattern.treeptik.proxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProxyList extends AbstractList {

	private ArrayList<String> list;
	private final String filePath;
	private Long nbLine;

	public ProxyList(String path) {
		this.filePath = path;

		Path path2 = Paths.get(filePath);

		try {
			nbLine = Files.lines(path2).count();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object get(int index) {

		if (list == null) {
			Path path2 = Paths.get(filePath);

			try {
				list = new ArrayList<String>(Files.lines(path2).collect(Collectors.toList()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list.get(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return nbLine.intValue();
	}

}
