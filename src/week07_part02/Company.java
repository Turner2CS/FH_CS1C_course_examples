package week07_part02;

public class Company
{
    public static void main(String[] args) throws Exception
    {
        FHhashQP<Employee> hashTable = new FHhashQP<Employee>();

        Employee e1 = new Employee("Jane Austin", 1);
        System.out.println("load size: " + hashTable.mLoadSize + ", size: " + hashTable.size());

        for (int i = 0; i < 47; i++)
        {
            hashTable.insert(e1);
            hashTable.remove(e1);
        }

        System.out.println("load size: " + hashTable.mLoadSize + ", size: " + hashTable.size());

    }
}
