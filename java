import java.util.*;

class RAG {

    void load() {
        policy.add("External storage not allowed");
        policy.add("Data must be encrypted")
    }

    String decide(String action) {
        if (action.contains("external"))
            return "Not Allowed";
        else
            return "Allowed"
    }

    public static void main(String args[]) {
        RAG r = new RAG();
        r.load();

        String action = "Store data on external server";
        String result = r.decide(action);

        System.out.println(result);
    }
}
