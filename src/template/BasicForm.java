package template;

/**
 * Created by andrew on 14-3-17.
 */
public class BasicForm {
    private String[] columnName;
    private int column;
    private int length;

    /** 构造函数：初始化链表 */
    public BasicForm(int userColumn,
                     String[] userColumnName)
    {
        column = userColumn;
        columnInit(column, userColumnName);

        length = 0;


    }

    /** 初始化列名 */
    private void columnInit(int column,
                            String[] userColumnName)
    {
        int ctrlColumnInit;

        columnName = new String[column];
        columnName[0] = "id";
        ctrlColumnInit = 1;

        for (String eachName : userColumnName)
        {
            columnName[ctrlColumnInit] = eachName;
            ++ctrlColumnInit;
        }
    }

    /**
     * 向表中插入一行
     * 内容为 String[] contentToAdd 中的每一个元素
     */

    public void add(String[] contentToAdd)
    {

    }

    /** 移除表中的某一行 */
    public void remove(int idToRemove)
    {

    }
}

