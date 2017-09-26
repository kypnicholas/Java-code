package com.kypnicholas;

/**
 * Created by nkypr on 16/07/2017.
 */
public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }



    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem!=null){
            int comparison = (currentItem.compareTo(newItem));
            if (comparison<0){                                                                          // newItem is greater, so we need to INSERT AFTER (move right) if possible
                if(currentItem.next()!= null){                                                          // check if we are not at the end of the list
                    currentItem=currentItem.next();
                }else{                                                                                  // there is no next, so insert at end of list
                    //currentItem.setNext(newItem);
                    //newItem.setPrevious(currentItem);
                    currentItem.setNext(newItem).setPrevious(currentItem);                              //SHORTCUT to replace the code in the two lines above.
                    return true;
                }
            } else if (comparison>0){                                                                   // newItem is less, INSERT BEFORE (or left)
                if(currentItem.previous()!=null){                                                       // if not at the beginning of the list
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else{                                                                                   // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else{                                                                                      //ITEMS ARE EQUAL
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
       if (item!=null){
           System.out.println("Deleting item " + item.getValue());
       }

       ListItem currentItem= this.root;
       while(currentItem!=null){
           int comparison = currentItem.compareTo(item);
           if(comparison==0){                                              // Item matches so need to delete it. (i.e. Bypass by pointing the previous to the right place)
               if(currentItem==this.root){
                   this.root=currentItem.next();
               }else{
                   currentItem.previous().setNext(currentItem.next());
                   if(currentItem.next()!=null){
                       currentItem.next().setPrevious(currentItem.previous());
                   }
               }
               return true;
           }else if (comparison<0){                                        // Haven't reached the point in the list where the items match so we want to continue traversing through it
               currentItem=currentItem.next();
           }else{                                                          // comparison > 0.We are at an item greater than the one to be deleted so item not in the list
               return false;
           }
       }
       return false;                                                       //Reached the end of the list without finding the right item to delete.
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
