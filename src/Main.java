import java.awt.*;
import java.awt.datatransfer.*;
import java.time.*;
import javax.swing.*;
public class Main
{
    public static void main(String...args)
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception exception)
        {
            JOptionPane.showMessageDialog(null,"System Requirements: Java 8!");
            exception.printStackTrace();
        }
        EventQueue.invokeLater(()->
        {
            JFrame iFrame=new MyFrame();
            iFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iFrame.setTitle("日语问候语 (あいさつ)");
            iFrame.setResizable(false);
            iFrame.setVisible(true);
        });
    }
}
class MyFrame extends JFrame
{
    JPanel firstPanel=new JPanel();
    JPanel secondPanel=new JPanel();
    JPanel thirdPanel=new JPanel();
    JPanel fourthPanel=new JPanel();
    JPanel fifthPanel=new JPanel();
    JPanel lastPanel=new JPanel();
    JPanel comboBoxPanel=new JPanel();
    String[] monthStrs= {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
    String[][] firstStrs=new String[12][];
    JComboBox<String> monthComboBox=new JComboBox<>(monthStrs);
    JComboBox<String> firstComboBox=new JComboBox<>();
    JComboBox<String> secondComboBox=new JComboBox<>();
    JComboBox<String> thirdComboBox=new JComboBox<>();
    JComboBox<String> fourthComboBox=new JComboBox<>();
    JComboBox<String> fifthComboBox=new JComboBox<>();
    JTextArea iTextArea=new JTextArea(5,40);
    JScrollPane iScrollPane=new JScrollPane(iTextArea);
    void init()
    {
        iTextArea.setLineWrap(true);
        monthComboBox.setSelectedItem(monthStrs[LocalDate.now().getMonthValue()-1]);
        firstStrs[0]=new String[] {"新春の候、","初春の候、","頌春の候、","厳寒の候、","厳冬の候、","中冬の候、","寒冷の候、","麗春の候、","大寒のみぎり、","酷寒のみぎり、",
            "寒さ厳しき季節、"};
        firstStrs[1]=new String[] {"余寒の候、","春寒の候、","晩冬の候、","向春の候、","解氷の候、","梅花の候、","余寒なお厳しき折、"};
        firstStrs[2]=new String[] {"早春の候、","春寒の候、","孟春の候、","春雨降りやまぬ候、","浅春のみぎり、","春寒しだいに緩むころ、","冬の名残のまだ去りやらぬ時候、",
            "春光天地に満ちて快い時候、","春分の季節、","春色のなごやかな季節、"};
        firstStrs[3]=new String[] {"陽春の候、","春暖の候、","軽暖の候、","麗春の候、","春暖快適の候、","桜花爛漫の候、","花信相次ぐ候、","春眠暁を覚えずの候、","仲春四月、",
            "春たけなわの今日この頃、"};
        firstStrs[4]=
            new String[] {"新緑の候、","薫風の候、","初夏の候、","立夏の候、","暮春の候、","老春の候、","晩春の候、","軽暑の候、","惜春のみぎり、","若葉の鮮やかな季節、"};
        firstStrs[5]=
            new String[] {"梅雨の候、","初夏の候、","短夜の候、","五月雨の候、","長雨の候、","薄暑の候、","向夏の候、","麦秋の候、","向暑のみぎり、","若鮎おどる季節、"};
        firstStrs[6]=
            new String[] {"猛暑の候、","酷暑の候、","炎暑の候、","盛夏の候、","大暑の候、","灼熱の候、","炎熱のみぎり、","甚暑のみぎり、","三伏のみぎり、","暑さ厳しき折から、"};
        firstStrs[7]=
            new String[] {"残暑の候、","残炎の候、","残夏の候、","暮夏の候、","季夏の候、","新涼の候、","秋暑厳しき候、","晩夏のみぎり、","処暑のみぎり、","残暑厳しき折から、"};
        firstStrs[8]=new String[] {"初秋の候、","仲秋の候、","錦秋の候、","寒露の候、","黄葉の候、","秋雨の候、","金風の候、","秋晴れの候、","菊薫る候、","秋たけなわの候、",
            "紅葉の季節、","秋冷の心地よい季節、"};
        firstStrs[9]=new String[] {"秋冷の候、","仲秋の候、","錦秋の候、","寒露の候、","黄葉の候、","秋雨の候、","金風の候、","秋晴れの候、","菊薫る候、","秋たけなわの候、",
            "紅葉の季節、","秋冷の心地よい季節、"};
        firstStrs[10]=new String[] {"晩秋の候、","暮秋の候、","向寒の候、","深冷の候、","菊花の候、","紅葉の候、","初霜の候、","氷雨の候、","枯れ葉舞う季節、"};
        firstStrs[11]=
            new String[] {"寒冷の候、","師走の候、","初冬の候、","寒気の候、","霜気の候、","霜寒の候、","季冬の候、","歳晩の候、","歳末ご多忙の折、","心せわしい年の暮れ、"};
        secondComboBox.addItem("貴社ますますご盛栄のこととお慶び申し上げます。");
        secondComboBox.addItem("貴社ますますご清祥のこととお慶び申し上げます。");
        secondComboBox.addItem("貴社いよいよご清栄のこととお慶び申し上げます。");
        secondComboBox.addItem("貴社いよいよご清祥のこととお慶び申し上げます。");
        secondComboBox.addItem("貴社ますますご繁栄のこととお慶び申し上げます。");
        secondComboBox.addItem("貴社いよいよご隆盛のこととお慶び申し上げます。");
        secondComboBox.addItem("貴社ますます御隆昌にてお慶び申し上げます。");
        secondComboBox.addItem("貴店ますますご発展のこととお慶び申し上げます。");
        secondComboBox.addItem("貴行ますますご清栄のこととお慶び申し上げます。");
        secondComboBox.addItem("ますます御健勝のこととお慶び申し上げます。");
        secondComboBox.addItem("時下ますますご清祥の段、お慶び申し上げます。");
        thirdComboBox.addItem("平素は格別のご高配を賜り、厚く御礼申し上げます。");
        thirdComboBox.addItem("日頃は大変お世話になっております。");
        thirdComboBox.addItem("平素は格別のお引き立てをいただき、厚く御礼申し上げます。");
        thirdComboBox.addItem("平素は格別のお引き立てを賜り、ありがたく厚く御礼申し上げます。");
        thirdComboBox.addItem("平素は当店を御利用いただき御厚情のほど、心より御礼申し上げます。");
        thirdComboBox.addItem("毎々格別のご愛顧を賜り、厚く御礼申し上げます。");
        thirdComboBox.addItem("平素はひとかたならぬ御愛顧を賜り、厚く御礼申し上げます。");
        thirdComboBox.addItem("平素はひとかたならぬ御愛顧を賜り、ありがとうございます。");
        thirdComboBox.addItem("平素は格別のご厚誼にあずかり、厚く御礼申し上げます。");
        thirdComboBox.addItem("日頃は格別のお引き立てをいただき、ありがたく御礼申し上げます。");
        thirdComboBox.addItem("毎度格別のお引き立てを賜り、厚く御礼申し上げます。");
        fourthComboBox.addItem("さて…");
        fourthComboBox.addItem("ところで…");
        fourthComboBox.addItem("他でもございませんが…");
        fourthComboBox.addItem("誠に恐縮ですが…");
        fourthComboBox.addItem("実はお願いがあるのですが…");
        fourthComboBox.addItem("早速ですが…");
        fifthComboBox.addItem("まずは右まで。");
        fifthComboBox.addItem("まずは用件のみ。");
        fifthComboBox.addItem("乱筆お許しください。");
        fifthComboBox.addItem("乱筆乱文ご容赦。");
        fifthComboBox.addItem("ご自愛のほど祈ります。");
        fifthComboBox.addItem("ご健康にはくれぐれもお気を付けください。");
        fifthComboBox.addItem("お元気でご活躍ください。");
        fifthComboBox.addItem("ご健康とご活躍を祈ります。");
        fifthComboBox.addItem("今後ともご指導、ご鞭撻を賜りますよう、よろしくお願い申し上げます。");
        fifthComboBox.addItem("引き続き倍旧のご厚情を賜りたく、切にお願い申し上げます。");
        fifthComboBox.addItem("末筆ながらご一同様にくれぐれもよろしく申し上げてください。");
        fifthComboBox.addItem("奥様へよろしくお伝えください。");
        fifthComboBox.addItem("ご返事お待ち申し上げております。");
        fifthComboBox.addItem("ご返事いただければ幸せです。");
        fifthComboBox.addItem("お手数ながらご返事をお願い申し上げます。");
        fifthComboBox.addItem("いずれまたお便りします。");
        fifthComboBox.addItem("近日中にお目にかかって申し上げます。");
        reInit(LocalDate.now().getMonthValue()-1);
        write();
    }
    void reInit(int i)
    {
        firstComboBox.removeAllItems();
        for(String str:firstStrs[i])
        {
            firstComboBox.addItem(str);
        }
    }
    void write()
    {
        if(firstComboBox.getSelectedIndex()!=-1)
        {
            StringBuilder iStringBuilder=new StringBuilder();
            iStringBuilder.append(firstComboBox.getSelectedItem().toString());
            iStringBuilder.append(secondComboBox.getSelectedItem().toString());
            iStringBuilder.append(thirdComboBox.getSelectedItem().toString());
            iStringBuilder.append(System.lineSeparator());
            iStringBuilder.append(fourthComboBox.getSelectedItem().toString());
            iStringBuilder.append(System.lineSeparator());
            iStringBuilder.append(fifthComboBox.getSelectedItem().toString());
            String str=iStringBuilder.toString();
            iTextArea.setText(str);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(str),null);
        }
    }
    public MyFrame()
    {
        init();
        monthComboBox.setEditable(false);
        firstComboBox.setEditable(true);
        secondComboBox.setEditable(true);
        thirdComboBox.setEditable(true);
        fourthComboBox.setEditable(true);
        fifthComboBox.setEditable(true);
        firstPanel.add(monthComboBox);
        firstPanel.add(firstComboBox);
        secondPanel.add(secondComboBox);
        thirdPanel.add(thirdComboBox);
        fourthPanel.add(fourthComboBox);
        fifthPanel.add(fifthComboBox);
        monthComboBox.addActionListener(event->reInit(monthComboBox.getSelectedIndex()));
        firstComboBox.addActionListener(event->write());
        secondComboBox.addActionListener(event->write());
        thirdComboBox.addActionListener(event->write());
        fourthComboBox.addActionListener(event->write());
        fifthComboBox.addActionListener(event->write());
        firstPanel.setBorder(BorderFactory.createTitledBorder("问候语"));
        secondPanel.setBorder(BorderFactory.createTitledBorder("贺词"));
        thirdPanel.setBorder(BorderFactory.createTitledBorder("感谢性语句"));
        fourthPanel.setBorder(BorderFactory.createTitledBorder("开头语"));
        fifthPanel.setBorder(BorderFactory.createTitledBorder("结束语"));
        lastPanel.setBorder(BorderFactory.createTitledBorder("生成文本"));
        comboBoxPanel.setLayout(new GridLayout(5,1,0,0));
        comboBoxPanel.add(firstPanel);
        comboBoxPanel.add(secondPanel);
        comboBoxPanel.add(thirdPanel);
        comboBoxPanel.add(fourthPanel);
        comboBoxPanel.add(fifthPanel);
        lastPanel.add(iScrollPane);
        add(comboBoxPanel,BorderLayout.CENTER);
        add(lastPanel,BorderLayout.SOUTH);
        pack();
    }
}
