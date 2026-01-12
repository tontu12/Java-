package todolist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * シンプルなToDoリストアプリケーション
 * タスクの追加、表示、削除、完了マークができます
 */
public class TodoList {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("=== ToDoリスト管理システム ===");
        
        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // 改行を消費
            
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    completeTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    running = false;
                    System.out.println("終了します。");
                    break;
                default:
                    System.out.println("無効な選択です。もう一度お試しください。");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void showMenu() {
        System.out.println("\n--- メニュー ---");
        System.out.println("1. タスクを追加");
        System.out.println("2. タスクを表示");
        System.out.println("3. タスクを完了にする");
        System.out.println("4. タスクを削除");
        System.out.println("5. 終了");
        System.out.print("選択: ");
    }
    
    private static void addTask() {
        System.out.print("タスクの内容を入力: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("タスクを追加しました！");
    }
    
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("タスクがありません。");
            return;
        }
        
        System.out.println("\n--- タスク一覧 ---");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isCompleted() ? "[完了]" : "[未完了]";
            System.out.println((i + 1) + ". " + status + " " + task.getDescription());
        }
    }
    
    private static void completeTask() {
        viewTasks();
        if (tasks.isEmpty()) {
            return;
        }
        
        System.out.print("完了にするタスクの番号: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // 改行を消費
        
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println("タスクを完了にしました！");
        } else {
            System.out.println("無効な番号です。");
        }
    }
    
    private static void deleteTask() {
        viewTasks();
        if (tasks.isEmpty()) {
            return;
        }
        
        System.out.print("削除するタスクの番号: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // 改行を消費
        
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("タスクを削除しました！");
        } else {
            System.out.println("無効な番号です。");
        }
    }
}

class Task {
    private String description;
    private boolean completed;
    
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isCompleted() {
        return completed;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
