/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tuple{
    TreeNode node;
    int row;
    int col;

    public Tuple(TreeNode node, int row , int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}


class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map = new TreeMap<>();

        Queue<Tuple>q = new LinkedList<>();

        q.offer(new Tuple(root,0,0));

        //BFS traversal

        while(!q.isEmpty()){
            Tuple tuple = q.poll();

            TreeNode node = tuple.node;
            int row = tuple.row;
            int col =  tuple.col;

            if(!map.containsKey(col)){
                map.put(col,new TreeMap<>());
            }

            if(!map.get(col).containsKey(row)){
                map.get(col).put(row, new PriorityQueue<>());
            }

            map.get(col).get(row).offer(node.val);

            // left child

            if(node.left!=null){
                q.offer(new Tuple(node.left , row+1, col-1));
            }

            //right child

            if(node.right!=null){
                q.offer(new Tuple(node.right, row+1, col+1));
            }
        }

        // final answer

        List<List<Integer>>result = new ArrayList<>();

        for(Integer col :map.keySet()){
            List<Integer> column = new ArrayList<>();

            TreeMap<Integer,PriorityQueue<Integer>> rows = map.get(col);

            for(Integer row : rows.keySet()){
                PriorityQueue<Integer> nodes = rows.get(row);

                while(!nodes.isEmpty()){
                    column.add(nodes.poll());
                }
            }
            result.add(column);
        }

        return result;
    }
}