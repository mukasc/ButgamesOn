package controle;

import org.primefaces.model.TreeNode;
import org.primefaces.model.DefaultTreeNode;
import facades.ProdutoFacade;
import javax.faces.bean.ManagedBean;

import modelo.Produto;
@ManagedBean(name="treeBeann")
public class TreeBean_1 {

	private TreeNode root;


        public TreeBean_1() {
		root = new DefaultTreeNode("root", null);
             
		TreeNode node0 = new DefaultTreeNode("Corrida", root);
		TreeNode node1 = new DefaultTreeNode("Ação", root);

                TreeNode node00 = new DefaultTreeNode("Need for Speed underground", node0);
		TreeNode node01 = new DefaultTreeNode("Need for speed undercover", node0);

                TreeNode node10 = new DefaultTreeNode("GTAIV", node1);
		TreeNode node11 = new DefaultTreeNode("Need for speed undercover", node1);




	}

	public TreeNode getRoot() {
		return root;
	}
}
