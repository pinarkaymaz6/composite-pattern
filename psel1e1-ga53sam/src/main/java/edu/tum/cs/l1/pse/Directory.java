package edu.tum.cs.l1.pse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends FileSystemObject{

	
	//TODO: add the missing inheritance
	//TODO: add the missing field
	//TODO: add the missing methods
	

	public Directory(String name) {
		super(name);
	}
	List<FileSystemObject> children = new ArrayList<FileSystemObject>();

	@Override
	public void list(int level) {
		printName(level);

		Iterator<FileSystemObject> iterator = children.iterator();
		while (iterator.hasNext()) {
			FileSystemObject child = (FileSystemObject) iterator.next();
			child.list(level + 1);
		}
	}

	public void addChild(FileSystemObject file){
		children.add(file);
	}

	public void removeChild(FileSystemObject file){
		children.remove(file);
	}

	public List<FileSystemObject> getChildren(){
		return children;
	}

}
