public class BST<T> {

    private Node<T> root;

    public void insert(Node node){
        if(root==null){
            root=node;

        }else{
            insert(node,root);
        }
    }


    private void insert(Node node,Node current){
        if(node.getKey().compareTo(current.getKey())<0){
            if(current.getLeft()==null){
                current.setLeft(node);
                return;
            }else {
                insert(node, current.getLeft());
                return;
            }
        } else if (node.getKey().compareTo(current.getKey())>0){
            if (current.getRight()==null){
                current.setRight(node);
                return;
            } else {
                insert(node, current.getRight());
                return;
            }
        }else{

        }


    }


    public String search(String goal){
        return search(goal, root);
    }
    int iterations=0;
    private String search(String goal, Node current){

        if(current == null){
            return "No se encontro el ciudadano";
        }
        if(goal.compareTo(current.getKey())==0){
            return current.getValue()+"\n"+"Numero de iteraciones:"+iterations;
        }
        else if(goal.compareTo(current.getKey())<0){
            iterations++;
            return search(goal, current.getLeft());
        } else{
            iterations++;
            return search(goal, current.getRight());
        }
    }

    public Node delete(String goal){

        return delete(goal,root);

    }

    private Node delete(String goal,Node current) {

        if (current == null) {
            return null;
        }

        if(goal.compareTo(current.getKey())==0){


            // nodo hoja
            if( current.getRight()== null && current.getLeft()==null){

                if(current==root){
                    root=null;
                }else {


                }
                return null;
            }

            // nodo solo hijo izquierdo
            else if( current.getRight()==null){
                return current.getLeft();

            }

            //nodo solo hijo derecho
            else if (current.getLeft()==null) {
                return current.getRight();
            }

            //nodo con dos hijos

            else {

                Node min= getMin(current.getRight());
                current.setValue(min.getValue());

                Node subarbolDer=delete(min.getValue(),current.getRight());
                current.setRight(subarbolDer);

                return current;

            }
        }else if(goal.compareTo(current.getKey())<0){
            Node subArbolIzquierdo=delete(goal,current.getLeft());
            current.setLeft(subArbolIzquierdo);
            return current;
        }else {
            Node subArbolDerecho=delete(goal,current.getRight());
            current.setRight(subArbolDerecho);
            return current;
        }


    }

    public Node getMin(Node current){
        if( current.getLeft()==null){
            return current;

        }
        return getMin(current.getLeft());
    }










}
