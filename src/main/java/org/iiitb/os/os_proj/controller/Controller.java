package org.iiitb.os.os_proj.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.iiitb.os.os_proj.commands.Cat;
import org.iiitb.os.os_proj.commands.Cd;
import org.iiitb.os.os_proj.commands.File;
import org.iiitb.os.os_proj.commands.Filesize;
import org.iiitb.os.os_proj.commands.Head;
import org.iiitb.os.os_proj.commands.Locate;
import org.iiitb.os.os_proj.commands.Ls;
import org.iiitb.os.os_proj.commands.Mkdir;
import org.iiitb.os.os_proj.commands.Mv;
import org.iiitb.os.os_proj.commands.Pwd;
import org.iiitb.os.os_proj.commands.Rmdir;
import org.iiitb.os.os_proj.commands.Tail;
import org.iiitb.os.os_proj.commands.Touch;

public class Controller {

    private enum commands {
        cat, cd, file, filesize, head, locate, ls, mkdir, mv, pwd, rmdir, tail, touch
    }

    public static String CURRENT_PATH = "";

    public Controller(String path) {
        this.CURRENT_PATH = path;
    }

    public void call(String cmd) {

        cmd = cmd.trim();
        List<String> params = new LinkedList<String>(Arrays.asList(cmd.split(" ")));
        String split_cmd = params.remove(0);

        //ArrayList<String> params = ;
        ArrayList<String> result = new ArrayList<String>();

        switch (commands.valueOf(split_cmd)) {
            case cat:
                Cat cat = new Cat();
                result = cat.runCommand(params);
                System.out.println(result);
                break;

            case cd:
                Cd cd = new Cd();
                result = cd.runCommand(params);
                System.out.println(result);
                break;

            case file:
                File file = new File();
                result = file.runCommand(params);
                System.out.println(result);
                break;

            case filesize:
                Filesize fs = new Filesize();
                result = fs.runCommand(params);
                System.out.println(result);
                break;

            case head:
                Head head = new Head();
                result = head.runCommand(params);
                System.out.println(result);
                break;

            case locate:
                Locate locate = new Locate();
                result = locate.runCommand(params);
                System.out.println(result);
                break;

            case ls:
                Ls ls = new Ls();
                result = ls.runCommand(params);
                System.out.println(result);
                break;

            case mkdir:
                Mkdir mkdir = new Mkdir();
                result = mkdir.runCommand(params);
                System.out.println(result);
                break;

            case mv:
                Mv mv = new Mv();
                result = mv.runCommand(params);
                System.out.println(result);
                break;

            case pwd:
                Pwd pwd = new Pwd();
                result = pwd.runCommand(params);
                System.out.println(result);
                break;

            case rmdir:
                Rmdir rmdir = new Rmdir();
                result = rmdir.runCommand(params);
                System.out.println(result);
                break;

            case tail:
                Tail tail = new Tail();
                result = tail.runCommand(params);
                System.out.println(result);
                break;

            case touch:
                Touch touch = new Touch();
                result = touch.runCommand(params);
                System.out.println(result);
                break;

            default:
                System.out.println("Command not found.");
        }

    }

    public static void main(String args[]) {

        new Controller("").call("cat desktop rajat");
    }

}