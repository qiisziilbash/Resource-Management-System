package businesslogic.utility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Esi on 6/23/2016.
 */
public class Tree<T> {
    private T data;
    private List<Tree<T>> children;

    public Tree(T data) {
        this.data = data;
        children = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public List<Tree<T>> getChildren() {
        return children;
    }

    public void addChild(Tree<T> child) {
        children.add(child);
    }

    public void removeChild(Tree<T> child) {
        children.remove(child);
    }

    public void print() {
        print(0);
    }

    public void print(int depth) {
        StringBuffer indent = new StringBuffer("");
        for(int i = 0 ; i < depth;i++) {
            indent.append("\t");
        }
        System.out.println(indent.toString() + data);
        for(Tree child: getChildren()) {
            child.print(depth+1);
        }
    }
}
