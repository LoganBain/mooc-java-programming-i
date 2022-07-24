
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.list = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                return;
            }
            handleCommand(command);
        }
    }
    
    public void handleCommand(String command) {
        if (command.equals("add")) {
            System.out.println("To add:");
            add(scanner.nextLine());
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            System.out.println("Which one is removed?");
            remove(Integer.valueOf(scanner.nextLine()));
        }            
    }
    
    public void add(String toAdd) {
        this.list.add(toAdd);
    }
    
    public void list() {
        this.list.print();
    }
    
    public void remove(int num) {
        this.list.remove(num);
    }
}
