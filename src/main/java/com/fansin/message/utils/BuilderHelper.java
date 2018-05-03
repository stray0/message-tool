package com.fansin.message.utils;

import cn.hutool.core.util.RandomUtil;

/**
 * <p>Title: BuilderHelper</p>
 * <p>Description: </p>
 *
 * @author zhaofeng
 * @version 1.0
 * @date 18 -5-3
 */
public class BuilderHelper {

    private BuilderHelper(){}

    /**
     * Random name string.
     *
     * @return the string
     */
    public static String randomName(){
        return RandomUtil.randomString(
                "赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤滕殷罗毕郝邬安常乐于时傅皮卞齐康伍余元卜顾孟平黄和穆萧尹姚邵湛汪祁毛禹狄米贝明臧计伏成戴谈宋茅庞熊纪舒屈项祝董梁杜阮蓝闵席季麻强贾路娄危江童颜郭梅盛林刁钟徐邱骆高夏蔡田樊胡凌霍虞万支柯昝管卢莫经房裘缪干解应宗丁宣贲邓郁单杭洪包诸左石崔吉钮龚程嵇邢滑裴陆荣翁荀羊於惠甄曲家封芮羿储靳汲邴糜松井段富巫乌焦巴弓牧隗山谷车侯宓蓬全郗班仰秋仲伊宫宁仇栾暴甘钭厉戎祖武符刘景詹束龙叶幸司韶郜黎蓟薄印宿白怀蒲邰从鄂索咸籍赖卓蔺屠蒙池乔阴鬱胥能苍双闻莘党翟谭贡劳逄姬申扶堵冉宰郦雍卻璩桑桂濮牛寿通边扈燕冀郏浦尚农温别庄晏柴瞿阎充慕连茹习宦艾鱼容向古易慎戈廖庾终暨居衡步都耿满弘匡国文寇广禄阙东欧殳沃利蔚越夔隆师巩厍聂晁勾敖融冷訾辛阚那简饶空曾毋沙乜养鞠须丰巢关蒯相查后荆红游竺权逯盖益桓公万俟司马上官欧阳夏侯诸葛闻人东方赫连皇甫尉迟公羊澹台公冶宗政濮阳淳于单于太叔申屠公孙仲孙轩辕令狐钟离宇文长孙慕容鲜于闾丘司徒司空丌官司寇仉督子车颛孙端木巫马公西漆雕乐正壤驷公良拓跋夹谷宰父谷梁晋楚闫法汝鄢涂钦段干百里东郭南门呼延归海羊舌微生岳帅缑亢况郈有琴梁丘左丘东门西门商牟佘佴伯赏南宫墨哈谯笪年爱阳佟",
                1) + RandomUtil.randomString(
                "勋瘾难觅择沓囍笑共鱼抹忆钟晚捕风荒弥龙将烟栀离葵她忆迷离^伪日后橘寄血腥鹿情巷欲馥之殊宠流萤凭你美咩敛歌唯安鹿君记号凉墨浮森歪脖囧逼归疚绿脊春慵溺庎瑛郎一秋惊梦俗欲伪装暮年配衬热呛星光欠欲魍魉梵行毛丝纵身扶袖丑味橙柒己矢照雨仙隐汐颜戏言千鲤私念情魄逆向里予伪笑哑萝炙痛冧穸巧逗怀桔孤亡怪比瘟疑找欢终憾信谎仙剑木岛耍弄涙笑城鱼心瘾蒙春喵酱七等冷魅云棉南妓帽客玩友孤稚亢潮堕戈煞尾温戾归戾妄友偏痴爱癌自赎",
                1);
    }

    /**
     * Random phone string.
     *
     * @return the string
     */
    public static String randomPhone(){
        return "1"+RandomUtil.randomNumbers(10);
    }

    /**
     * Random id no string.
     *
     * @return the string
     */
    public static String randomIdNo(){
        return RandomUtil.randomNumbers(18);
    }

    /**
     * Random bank code string.
     *
     * @return the string
     */
    public static String randomBankCard(){
        return RandomUtil.randomNumbers(19);
    }


}
