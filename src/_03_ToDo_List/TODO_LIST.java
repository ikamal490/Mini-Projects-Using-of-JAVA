package _03_ToDo_List;

import java.util.Scanner;

public class TODO_LIST {
   static String[] arr = new String[100];
   static Scanner sc = new Scanner(System.in);
   static int counter = 0;

   public static void addTask(){
       System.out.print("Enter Task:");
       String addTask = sc.nextLine();
       arr[counter++] = "[Pending] "+addTask;
       System.out.println("Task Added Successfully !");
   }

   public static void viewTask(){
       if(counter == 0){
           System.out.println("No task added");
           return;
       }

       for(int i=0; i<counter; i++){
           System.out.println(i+1+"."+arr[i]);
       }
   }

   public static void markTaskDone(){
       viewTask();
       if(counter == 0)
           return;

       System.out.print("Enter Task number which has completed: ");
       int index = sc.nextInt()-1;
       if(index >= 0  && index < counter){
           String task = arr[index];
           if(task.startsWith("[Done]")){
               System.out.println("Already Done");
           }
           else{
               task = task.replace("[Pending]","[Done]");
               arr[index] = task;
               System.out.println("Task marked Done");
           }
       }
       else{
           System.out.println("Invalid number");
       }
   }

   public static void deleteTask(){
       viewTask();
       System.out.print("Enter the task no. which you want to delete:");
       int index = sc.nextInt()-1;
       for(int i=index; i<counter-1; i++){
           arr[i] = arr[i+1];
       }
       counter--;
       System.out.println("Task successfully Deleted !");
   }

    public static void main(String[] args) {
        while(true){
            System.out.println("\n1.Add Task \n2.View Task \n3.Mark Task Done \n4.Delete Task \n5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTask();
                    break;

                case 3:
                    markTaskDone();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid number");
            }
        }
    }
}
/*
Output:

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
1
Enter Task:Complete maths unit 2
Task Added Successfully !

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
1
Enter Task:Complete 2D array
Task Added Successfully !

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
1
Enter Task:Complete lab file
Task Added Successfully !

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
1
Enter Task:Complete assignment
Task Added Successfully !

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
2
1.[Pending] Complete maths unit 2
2.[Pending] Complete 2D array
3.[Pending] Complete lab file
4.[Pending] Complete assignment

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
3
1.[Pending] Complete maths unit 2
2.[Pending] Complete 2D array
3.[Pending] Complete lab file
4.[Pending] Complete assignment
Enter Task number which has completed: 2
Task marked Done

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
2
1.[Pending] Complete maths unit 2
2.[Done] Complete 2D array
3.[Pending] Complete lab file
4.[Pending] Complete assignment

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
3
1.[Pending] Complete maths unit 2
2.[Done] Complete 2D array
3.[Pending] Complete lab file
4.[Pending] Complete assignment
Enter Task number which has completed: 4
Task marked Done

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
2
1.[Pending] Complete maths unit 2
2.[Done] Complete 2D array
3.[Pending] Complete lab file
4.[Done] Complete assignment

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
4
1.[Pending] Complete maths unit 2
2.[Done] Complete 2D array
3.[Pending] Complete lab file
4.[Done] Complete assignment
Enter the task no. which you want to delete:1
Task successfully Deleted !

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
2
1.[Done] Complete 2D array
2.[Pending] Complete lab file
3.[Done] Complete assignment

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
4
1.[Done] Complete 2D array
2.[Pending] Complete lab file
3.[Done] Complete assignment
Enter the task no. which you want to delete:3
Task successfully Deleted !

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
2
1.[Done] Complete 2D array
2.[Pending] Complete lab file

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
1
Enter Task:Complete dsa questions
Task Added Successfully !

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
2
1.[Done] Complete 2D array
2.[Pending] Complete lab file
3.[Pending] Complete dsa questions

1.Add Task
2.View Task
3.Mark Task Done
4.Delete Task
5.Exit
5

 */
