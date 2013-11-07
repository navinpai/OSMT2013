package org.iiitb.os.os_proj.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.iiitb.os.os_proj.UserFile;
import org.iiitb.os.os_proj.utils.GetPath;

public class Filesize implements ICommand {

	public ArrayList<String> runCommand(List<String> params) {
		
		ArrayList<String> path = GetPath.getSearchPath(params.get(0));
		ArrayList<String> result = new ArrayList<String>();
		
		// search in db for file		
		Map<String, String> constraints = new HashMap<String, String>();
		constraints.put("name", path.get(0));
		constraints.put("path", path.get(1));
		ArrayList<UserFile> receivedFile = mongoConnect.getFiles(constraints);
		
		// if exists, return success and filesize
				// else return failure
		if (receivedFile.size() == 0) {
			result.add(ICommand.FAILURE);
			result.add(path.get(0) + "\tERROR: cannot open '" + path.get(0) + "' (No such file or directory)");

		} else {
			result.add(ICommand.SUCCESS);
			result.add(Long.toString(receivedFile.get(0).getFile_size()));
		}			
		return result;
	}

}
