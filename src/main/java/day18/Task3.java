package day18;

public class Task3 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node rootNode = new Node(20);

        // вставляем узлы в дeрево:
        tree.insertNode(14, rootNode);
        tree.insertNode(23, rootNode);
        tree.insertNode(11, rootNode);
        tree.insertNode(16, rootNode);
        tree.insertNode(5, rootNode);
        tree.insertNode(8, rootNode);
        tree.insertNode(15, rootNode);
        tree.insertNode(18, rootNode);
        tree.insertNode(22, rootNode);
        tree.insertNode(27, rootNode);
        tree.insertNode(24, rootNode);
        tree.insertNode(150, rootNode);
        // отображение дерева

        tree.dfs(rootNode);


    }
}