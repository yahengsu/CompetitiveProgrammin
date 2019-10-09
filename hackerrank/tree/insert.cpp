#include <iostream>
#include <cstddef>

class Node
{
public:
    int data;
    Node *left;
    Node *right;
    Node(int d)
    {
        data = d;
        left = NULL;
        right = NULL;
    }
};

class Solution
{
public:
    void preOrder(Node *root)
    {

        if (root == NULL)
            return;

        std::cout << root->data << " ";

        preOrder(root->left);
        preOrder(root->right);
    }

    /* you only have to complete the function given below.  
Node is defined as  

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

*/

    Node *insert(Node *root, int data)
    {
        Node *temp = root;
        if (root == NULL)
        {
            root = new Node(data);
            return root;
        }
        else
        {
            bool added = false;
            while (!added)
            {
                if (data <= temp->data)
                {
                    if (temp->left == NULL)
                    {
                        temp->left = new Node(data);
                        added = true;
                        return root;
                    }
                    else
                    {
                        temp = temp->left;
                    }
                }
                else if (data > temp->data)
                {
                    if (temp->right == NULL)
                    {
                        temp->right = new Node(data);
                        added = true;
                        return root;
                    }
                    else
                    {
                        temp = temp->right;
                    }
                }
            }
        }
        return root;
    }

}; //End of Solution

int main()
{

    Solution myTree;
    Node *root = NULL;

    int t;
    int data;

    std::cin >> t;

    while (t-- > 0)
    {
        std::cin >> data;
        root = myTree.insert(root, data);
    }
    myTree.preOrder(root);
    return 0;
}
