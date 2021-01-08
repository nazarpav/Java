public class Main {
    private static void Task1(String[] args) {
        for (int i = args.length - 1; i >= 0; --i) {
            System.out.println(args[i]);
        }
    }

    private static void Task2(String[] args) {
        String password = "password";
        if (args.length == 1) {
            System.out.println(args[0].equals(password) ? "Great" : "Lose");
        } else {
            System.out.println("Lose");
        }
    }

    private static void Task3(String[] args) {
        int res=0;
        for (var item: args) {
            try{
                res+=Integer.parseInt(item);
            }
            catch (Exception ex){
                System.out.println("Error "+ex.getMessage());
                return;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        //Task1(args);
        //Task2(args);
        //Task3(args);
    }
}
