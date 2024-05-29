package Practice.Work5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.isEmpty()) {
                    System.out.println(getName() + boxList);
                    System.out.println("共" + boxList.size() + "个奖项");
                    System.out.println("最高奖项为" + Collections.max(boxList));
                    break;
                } else {
                    //对list中的元素进行洗牌
                    Collections.shuffle(list);
                    int prize = list.removeFirst();
                    boxList.add(prize);
                }
            }
        }
    }
}
