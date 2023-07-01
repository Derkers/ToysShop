public class Program {
    public static void main(String[] args) {
        Store s = new Store();
        boolean flag = true;
        while (flag) {
            String inputData = InOut.Input("Enter:\n" +
                    "add\n" +
                    "get\n" +
                    "shop\n" +
                    "exit\n" + ": ");
            System.out.println();
            inputData.toLowerCase();
            switch (inputData) {
                case "add":
                    s.AddToy(new Toy(InOut.Input(" name of toy and the probability: ")));
                    break;
                case "get":
                    s.GetResult(Integer.parseInt(InOut.Input("number of attempts: ")));
                    System.out.println(s.resultToString());
                    InOut.Save("result.txt", s.resultToString());
                    break;
                case "shop":
                    s.ShowToys();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("error!");
                    break;
            }
            System.out.println();
        }
    }
}