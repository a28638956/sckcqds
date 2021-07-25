/*
* 商城库存清单案例
* 变量的形式对商品的数据保存
* 品牌尺寸大小，价格，配置，库存数量
*
* 三个商品苹果，Thinkpad，华硕
* 计算出总的库存数，和商品的总金额
* */
public class StoreList {
    public static void main(String[] args){
        //苹果笔记本电脑
        String macBrand ="macBookAir";
        double macSize = 13.0;
        double macPrice = 6988.88;
        String macConfig = "i5处理器4GB内存128GB固态硬盘";
        int macCount = 5;

        //联想Thinkpad笔记本电脑
        String thinkpadBrand ="ThinkpadT450";
        double thinkpadSize = 14.0;
        double thinkpadPrice = 5999.99;
        String thinkpadConfig = "i5处理器4GB内存500GB硬盘";
        int thinkpadCount = 10;

        //华硕Asus笔记本电脑
        String AsusBrand ="Asus-FL5800";
        double AsusSize = 15.6;
        double AsusPrice = 4999.50;
        String AsusConfig = "i7处理器4GB内存280GB固态硬盘";
        int AsusCount = 18;
        //输出列表的顶部
        System.out.println("------------------------商城库存清单--------------------------");
        System.out.println("品牌型号       尺寸   价格          配置                库存数量");
        System.out.println(macBrand+"  "+macSize+"  "+macPrice+"  "+macConfig+"      "+macCount);
        System.out.println(thinkpadBrand+"  "+thinkpadSize+"  "+thinkpadPrice+"  "+thinkpadConfig+"      "+thinkpadCount);
        System.out.println(AsusBrand+"  "+AsusSize+"  "+AsusPrice+"  "+AsusConfig+"      "+AsusCount);

        //统计总库存数总库存金额
        int totalCount = macCount+thinkpadCount+AsusCount;
        double totalMoney = (macCount*macPrice)+(thinkpadCount*thinkpadPrice)+(AsusCount*AsusPrice);
        //列表底部
        System.out.println("------------------------------------------------------------");
        System.out.println("总库存数："+totalCount);
        System.out.println("总库存金额："+totalMoney);



    }
}
