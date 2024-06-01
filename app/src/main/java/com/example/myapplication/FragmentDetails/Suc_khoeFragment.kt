package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.FragmentDetails.RecAadapter

class Suc_khoeFragment : Fragment() {
    private lateinit var imageId: Array<Int>
    private lateinit var names: Array<String>
    private lateinit var ingredients: Array<String>

    private lateinit var recView: RecyclerView
    private lateinit var itemArrayList: ArrayList<News>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sac_dep, container, false)
        val recyclerView = view!!.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        imageId = arrayOf(
            R.drawable.chuoi,
            R.drawable.hongxiem,
            R.drawable.xaden,
            R.drawable.nulang,
            R.drawable.oc,
            R.drawable.nuocloc
        )

        names = arrayOf(
            "Hai loại trái cây 'cứu mạng' người tăng huyết áp",
            "Loại quả có thể ngăn ngừa ung thư, tăng huyết áp",
            "Xạ đen giúp giải nhiệt ngày nắng nóng, hỗ trợ phòng ung thư",
            "Nữ lang - thảo dược quý giúp giấc ngủ vẹn tròn",
            "Món ốc ngon, nhiều chất nhưng một số người cần tránh xa",
            "Một điều bác sĩ tim mạch người Mỹ làm ngay sau khi ngủ dậy"
        )

        ingredients = arrayOf(
            "Người tăng huyết áp được khuyến khích thường xuyên ăn trái cây, đặc biệt là chuối và táo để phòng ngừa các biến cố tim mạch.\n" +
                    "Ba tôi 58 tuổi, bị tăng huyết áp, có thời điểm chỉ số lên tới 190mmHg. Gần đây, ông đi khám được bác sĩ chẩn đoán thêm tiền đái tháo đường. Về nhà, ba tôi kiêng cữ tất cả các loại trái cây có đường, tinh bột. Ông chỉ ăn thanh long, dưa chuột, đôi khi người mệt, chân tay bủn rủn. Bác sĩ tư vấn giúp người tăng huyết áp ăn trái cây gì là tốt nhất. Xin cảm ơn! (Trần Hoàng Linh - Long Biên, Hà Nội).\n" +
                    "\n" +
                    "Bác sĩ Nguyễn Huy Hoàng - Trung tâm Oxy cao áp Việt Nga, Bộ Quốc phòng (Hà Nội) tư vấn:\n" +
                    "\n" +
                    "Tăng huyết áp là căn bệnh phổ biến trên toàn thế giới hiện nay, bị coi là sát thủ thầm lặng, khiến 10 triệu người tử vong mỗi năm. \n" +
                    "\n" +
                    "Tại Việt Nam, cứ 4 người trưởng thành có 1 người bị tăng huyết áp. Bệnh nhân tăng huyết áp phải dùng thuốc suốt đời. Nếu ngưng thuốc hoặc kiểm soát bệnh không tốt có thể gây ra các biến cố sức khỏe như đột quỵ, nhồi máu cơ tim.\n" +
                    "\n" +
                    "Trong chế độ sinh hoạt hằng ngày, người bệnh được tư vấn ăn uống khoa học kết hợp tập thể dục phù hợp với tình trạng sức khỏe. Trong đó, bổ sung thêm trái cây, rau xanh là lựa chọn tốt. \n" +
                    "\n" +
                    "Các nghiên cứu gần đây chỉ ra rằng nếu người tăng huyết áp thường xuyên ăn trái cây có thể giảm nguy cơ tử vong. Một nghiên cứu trên 2.500 bệnh nhân tăng huyết áp trong vòng 10 năm cho kết quả, nếu 1 tuần ăn táo 3-6 lần sẽ giảm 40% nguy cơ tử vong do bệnh này. Ăn chuối từ 3-6 lần/tuần giảm được 24%. Người bệnh ăn cả chuối và táo giảm 43% nguy cơ tử vong do huyết áp cao. \n" +
                    "\n" +
                    "Táo rất giàu hàm lượng chất chống oxy hóa tự nhiên có tác dụng hạ mỡ máu, huyết áp, loại bỏ các gốc tự do dư thừa trong quá trình lão hóa của cơ thể.\n" +
                    "\n" +
                    "Chuối là trái cây giàu kali. Bổ sung chuối thường xuyên giúp hạ huyết áp, mạch máu được thư giãn. Kali cũng hỗ trợ bài tiết natri qua nước tiểu. Natri trong máu cao là nguyên nhân gây ra tăng huyết áp."+
                    "Chuối còn chứa nhiều magie có tác dụng hỗ trợ chức năng cơ, bảo vệ hệ tim mạch. Chuối rất giàu chất chống oxy hóa như vitamin C và catechin, cải thiện chức năng nội mô, từ đó góp phần giảm huyết áp.\n" +
                    "\n" +
                    "Về chỉ số đường huyết cao ở mức tiền đái tháo đường, người bệnh chỉ cần thay đổi chế độ ăn, hạn chế bánh kẹo ngọt, giảm lượng tinh bột như cơm trắng, bánh phở, bún, thay thế bằng trái cây, rau xanh thay vì kiêng ăn gây thiếu chất, mệt mỏi.",
            "Hồng xiêm chứa một nguồn dinh dưỡng tuyệt vời, giàu vitamin C và A, kali, đồng, sắt và chất tannin chống oxy hóa phòng ngừa nhiều bệnh tật.\n" +
                    "Hồng xiêm hay còn gọi là quả sapoche, có tên khoa học là Manilkara zapota, là một loại quả có nguồn gốc ở miền Nam Mexico, Trung Mỹ và Caribe. Đây là loại trái cây phổ biến ngày hè, tốt cho sức khỏe.\n" +
                    "\n" +
                    "Mỗi quả hồng xiêm là nguồn cung cấp dồi dào carbohydrates, vitamin C và các loại vitamin khác như vitamin A và B-complex. Hồng xiêm cũng rất giàu khoáng chất bao gồm đồng, sắt, phốt pho, magiê, kẽm, canxi và các chất điện giải như natri và kali.\n" +
                    "\n" +
                    "Tác dụng của hồng xiêm với sức khỏe con người:\n" +
                    "\n" +
                    "Phòng ung thư: Quả hồng xiêm giàu chất chống oxy hóa, có tác dụng làm giảm nguy cơ mắc các dạng ung thư khác nhau. Ngoài ra, hàm lượng vitamin nhóm B và vitamin C trong quả hồng xiêm cũng giúp duy trì niêm mạc khỏe mạnh, giúp giảm nguy cơ ung thư phổi và ung thư miệng."+
                    "Giảm huyết áp: Trong 100g hồng xiêm có tới 193mg potassium. Đây là thành phần quan trọng có trong trái cây để cung cấp vào cơ thể giúp hạ huyết áp. Một nghiên cứu khoa học được thế giới công nhận, nếu tiêu thụ một lượng đầy đủ potassium sẽ giảm được nguy cơ tăng huyết áp và hạ huyết áp.\n" +
                    "\n" +
                    "Tốt cho người bị bệnh thận: Sodium là một chất có nhiều trong muối ăn và có ở hầu hết các thực phẩm và hoa quả. Sodium rất thiết yếu trong việc điều hòa thể dịch, cũng như giúp vào những hoạt động biến dưỡng của cơ thể. Tuy nhiên, nếu lượng sodium nhiều sẽ có nguy cơ mắc một số bệnh thận, huyết áp và tim mạch. Trong quả hồng xiêm, lượng chất này ít thay vào đó là vị ngọt tự nhiên nên giúp cho người bệnh huyết áp, tim mạch và bệnh thận có thể thưởng thức trái cây này.\n" +
                    "\n" +
                    "Giải nhiệt: Hồng xiêm chín có thể kết hợp với một số loại quả tạo thành nước sinh tố giải khát rất thơm ngon, bổ dưỡng. Thông dụng nhất là sinh tố hồng xiêm với sữa tươi giúp hạ nhiệt, đặc biệt lúc giao mùa thích hợp cho tăng sức đề kháng cơ thể.\n" +
                    "\n" +
                    "Chống tiêu chảy: Quả hồng xiêm khi chưa chín chứa nhiều chất tannin nên có vị rất chát. Người dân thường lấy hông xiêm còn xanh sắc lấy nước uống để chữa tiêu chảy, cho hiệu quả rất tốt.\n" +
                    "\n" +
                    "Chống viêm: Hồng xiêm còn là một tác nhân chống viêm; có thể được sử dụng để ngăn ngừa viêm ruột, viêm dạ dày, và hội chứng ruột kích thích. \n" +
                    "\n" +
                    "Hạ sốt: Lấy 6 hạt hồng xiêm đem nghiền thành bột, uống với rượu hay nước chín sẽ giúp cơ thể hạ sốt. \n" +
                    "\n" +
                    "Tốt cho bà bầu: Hồng xiêm còn chứa Carbohydrate cũng như những dinh dưỡng có lợi khác thích hợp cho phụ nữ mang thai. Đặc biệt với các trường hợp suy nhược cơ thể của bà bầu, loại trái cây này còn phát huy công dụng nhiều hơn nữa. \n" +
                    "\n" +
                    "Tuy mang lại nhiều tác dụng tuyệt vời, khi ăn quả hồng xiêm vẫn cần nên lưu ý, bạn chỉ nên ăn với một lượng thích hợp, vừa phải, không ăn quá nhiều hồng xiêm cùng một lúc. Người bị đái tháo đường nên hạn chế ăn. Tránh ăn hồng xiêm còn xanh để không bị táo bón do chất tanin có trong loại trái cây này. Để đảm bảo chất lượng, nên lựa chọn mua quả hồng xiêm ở các địa chỉ đảm bảo về độ uy tín.",
            "Thành phần của xạ đen có nhiều dược tính tốt cho sức khỏe, giúp tăng cường sức đề kháng, giải nhiệt.\n" +
                    "Xin chào chuyên gia, mùa hè tôi thường xuyên uống nước trà xanh, gần đây tôi chuyển sang uống xạ đen. Nếu dùng xạ đen thay trà hằng ngày uống trong mùa hè được không? Ai không nên dùng thức uống này? (Phương Mai, Nam Định)\n" +
                    "\n" +
                    "Lương y Đa khoa Bùi Đắc Sáng, Viện Hàn lâm Khoa học và Công nghệ Việt Nam, Hội Đông Y Hà Nội, tư vấn:\n" +
                    "\n" +
                    "Theo quan niệm Đông y, cây xạ đen có tính hàn, vị chát, giúp thanh nhiệt, giải độc, trị viêm gan, an thần, hỗ trợ ngủ ngon, hạ huyết áp. Dược liệu này rất tốt cho sức khỏe, hỗ trợ tăng cường sức đề kháng. \n" +
                    "\n" +
                    "Trong y học hiện đại, xạ đen chứa các polyphenol, sesquiterpene, triterpene, hợp chất khác như flavonoid, quinon, tanin, axit amin… Các hợp chất có trong cây xạ đen như flavonoid, polyphenol, quinone… có tác dụng chống hình thành khối u, ức chế sự phát triển, hạn chế di căn, hỗ trợ phòng ngừa ung thư."+
                    "Với những tác dụng trên, bạn hoàn toàn có thể dùng lá xạ đen làm nước trà hằng ngày. Khi uống xạ đen, bạn lưu ý chỉ dùng khoảng 70g khô/ngày. Lá cành tươi dùng dưới 200g/ngày. Người có bệnh mãn tính đi kèm, bệnh về tiêu hóa nên xin tư vấn của thầy thuốc chuyên môn, tránh tác dụng phụ từ loại đồ uống này.\n" +
                    "\n" +
                    "Những ai không nên dùng xạ đen:\n" +
                    "\n" +
                    "- Người huyết áp thấp: Xạ đen có tác dụng hạ huyết áp, vì vậy người huyết áp thấp không nên sử dụng xạ đen. Nếu bạn muốn dùng, khi nấu xạ đen có thể thêm vài lát gừng.\n" +
                    "\n" +
                    "- Người có bệnh thận: Xạ đen tốt cho gan nhưng thận phải lọc thải nhiều. Người có bệnh thận mãn tính như suy thận, viêm cầu thận… không dùng dược liệu này.\n" +
                    "\n" +
                    "- Phụ nữ mang thai, trẻ em dưới 1 tuổi: Hiện nay chưa có khuyến cáo về cây xạ đen ảnh hưởng tới quá trình phát triển của thai nhi hay không. Tuy nhiên, bạn không nên uống loại dược liệu này vì nhóm đối tượng nhạy cảm.\n" +
                    "\n" +
                    "- Người bị tiêu chảy, rối loạn tiêu hóa: Xạ đen tính hàn có thể làm nặng hơn tình trạng này.\n" +
                    "\n" +
                    "Những thực phẩm không dùng với xạ đen như bia rượu, cà và măng muối chua. Nếu bạn đang sử dụng thuốc tây thời gian uống thuốc và xạ đen cách nhau 30 phút.",
            "Theo Ths. BS Nguyễn Thị Hằng - nguyên Phó Giám đốc Bệnh viện Tuệ Tĩnh, thảo dược nữ lang có lịch sử hơn 2.000 năm, nổi tiếng chữa các chứng mất ngủ, khó ngủ, ngủ không sâu giấc.\n" +
                    "Công dụng chữa mất ngủ của cây nữ lang"+
                    "Nữ lang là loại thảo dược có tên khoa học là Valeriana Officinalis L, sinh trưởng rộng rãi chủ yếu ở châu Âu, nhưng cũng phát triển ở một số vùng Nam Mỹ và châu Á. Tại Việt Nam, thảo dược này mọc ở các vùng núi cao như: Lào Cai, Lai Châu, Hà Giang, Quảng Nam, Lâm Đồng. \n" +
                    "\n" +
                    "Theo Ths. BS Nguyễn Thị Hằng - nguyên Phó Giám đốc Bệnh viện Tuệ Tĩnh, rễ và thân nữ lang được sử dụng để làm thuốc. Trong y học cổ truyền, nữ lang có vị ngọt, tính ấm, tác dụng vào kinh tâm, tỳ, thận.\n" +
                    "\n" +
                    "Từ 2.000 năm trước nữ lang đã được con người sử dụng trong các bài thuốc trị mất ngủ. Đến thế kỉ XVIII, cây này được nghiên cứu sâu rộng hơn, được chỉ định điều trị các triệu chứng liên quan đến thần kinh như: mất ngủ, bồn chồn, lo lắng. Ngoài ra, theo nghiên cứu khoa học, nữ lang còn có tác dụng chống co giật, hỗ trợ bệnh viêm loét dạ dày, tăng lưu lượng máu ở động mạch vành, bảo vệ gan, hỗ trợ điều trị bệnh viêm gan B. \n" +
                    "\n" +
                    "Ths. BS Nguyễn Thị Hằng cho biết, nhiều nghiên cứu chỉ ra, nữ lang chứa 2 hợp chất có tác dụng hiệp đồng giúp an thần, cải thiện về chất lượng và thời gian ngủ là Acid Valerenic và Phytomelatonin. \n" +
                    "\n" +
                    "Trong đó, Acid Valerenic gắn vào thụ thể GABA - một chất dẫn truyền thần kinh sản xuất trong não bộ có tác dụng điều hòa giấc ngủ; từ đó làm tăng nồng độ GABA, làm dịu thần kinh, an thần, giảm lo âu, giúp đi vào giấc ngủ dễ dàng hơn, kéo dài thời gian ngủ sâu.\n" +
                    "\n" +
                    "Phytomelatonin (melatonin thực vật) là hợp chất có cấu trúc tương tự Melatonin, hormone có vai trò điều chỉnh nhịp sinh học của giấc ngủ. Phytomelatonin trong nữ lang giúp bổ sung Melatonin cho cơ thể, tạo cảm giác buồn ngủ tự nhiên và tăng cường chất lượng giấc ngủ, giúp dễ ngủ và ngủ ngon hơn.\n" +
                    "\n" +
                    "Vị chuyên gia cho biết, một đánh giá tổng hợp từ 60 nghiên cứu được tiến hành trên đa dạng đối tượng như: người khỏe mạnh, người bị mất ngủ cấp và mạn tính, bệnh nhân ung thư, phụ nữ mãn kinh, người cao tuổi hay có rối loạn về thần kinh thực vật đều có chỉ số giấc ngủ tích cực hơn. Theo đó, thời gian ngủ sâu tăng lên đáng kể, giảm tình trạng căng thẳng, lo âu, an thần hiệu quả, chất lượng giấc ngủ cải thiện.\n" +
                    "\n" +
                    "Nhiều khảo sát khác từ người dùng cũng cho thấy việc sử dụng các sản phẩm chiết xuất từ nữ lang giúp tạo giấc ngủ sinh lý tự nhiên, không bị mệt mỏi sau khi thức dậy và không bị lệ thuộc thuốc so với việc sử dụng các loại thuốc ngủ, thuốc an thần, Ths. BS Nguyễn Thị Hằng thông tin thêm.\n" +
                    "\n" +
                    "Ứng dụng nữ lang trong sản phẩm chăm sóc sức khỏe\n" +
                    "\n" +
                    "Nhờ tính hiệu quả, độ an toàn của nữ lang, thảo dược này đã được Cục Quản lý Dược phẩm và Thực phẩm Hoa Kỳ (FDA) cấp chứng nhận an toàn GRAS. Ngày nay, nữ lang được ứng dụng rộng rãi trong các sản phẩm bảo vệ sức khỏe."+
                    "Ở Việt Nam, Công ty Dược phẩm Tâm Bình đã đưa thành phần nữ lang vào trong sản phẩm TPBVSK An thần ngủ ngon Tâm Bình. Bên cạnh nữ lang, sản phẩm này còn có nhiều thảo dược quý như: lạc tiên, lá vông, bình vôi, đương quy, xuyên khung, long nhãn…\n" +
                    "TPBVSK An thần Ngủ ngon Tâm Bình phù hợp cho người khó ngủ, mất ngủ, ngủ chập chờn. Sản phẩm hỗ trợ an thần, giúp dễ ngủ, ngủ ngon; hỗ trợ giảm các triệu chứng mất ngủ, ngủ không sâu giấc, ngủ mê, lo âu, căng thẳng, suy nhược thần kinh…",
            "Món ốc chứa nhiều chất lượng dinh dưỡng nhưng lượng purin, natri cao và có nguy cơ nhiễm ký sinh trùng.\n" +
                    "Không chỉ ở Việt Nam mà tại nhiều nơi trên thế giới, trong đó có Pháp, Đức và Bồ Đào Nha, ốc được sử dụng làm thực phẩm chế biến nhiều món ngon. \n" +
                    "\n" +
                    "Giá trị dinh dưỡng\n" +
                    "\n" +
                    "Theo Webmd, trong 100g ốc sống có 102 calo, 2g chất béo, 57mg cholesterol, 79g natri, 2g carbohydrate và 18g protein.  \n" +
                    "\n" +
                    "Hàm lượng protein trong ốc tương tự như protein trong thịt lợn và thịt bò, nhưng ốc ít chất béo hơn nhiều. Ngoài ra, ốc còn là nguồn cung cấp sắt, canxi, vitamin A và một số khoáng chất khác.\n" +
                    "\n" +
                    "Vitamin A trong ốc giúp hệ miễn dịch chống lại bệnh tật, tăng cường sức khỏe cho đôi mắt, giúp các tế bào trong cơ thể bạn phát triển. Canxi giúp xương chắc khỏe và giảm nguy cơ phát triển các vấn đề liên quan đến xương như loãng xương. Sắt giúp các tế bào hồng cầu vận chuyển oxy đến tất cả bộ phận trong cơ thể, cũng như giữ cho tóc, móng tay và làn da khỏe mạnh."+
                    "Tác dụng tiềm năng\n" +
                    "\n" +
                    "Thời xa xưa, ốc được cho có thể chữa nhiều loại bệnh từ ho thông thường đến bệnh lao. Ngày nay, ốc chủ yếu được dùng để chế biến món ăn chứ không phải dược liệu chữa bệnh. Tuy nhiên, món ốc vẫn có một số lợi ích sức khỏe nhất định. \n" +
                    "\n" +
                    "Cải thiện tình trạng thiếu máu\n" +
                    "\n" +
                    "Thiếu máu do thiếu sắt có thể gây ra các triệu chứng bao gồm mệt mỏi, suy nhược, da nhợt nhạt, đau ngực, nhức đầu, chóng mặt và khó thở. Ăn ốc có thể giúp giảm một số triệu chứng này do ốc là nguồn cung cấp sắt phong phú. 100g ốc có thể cung cấp 22% lượng sắt được khuyến nghị hằng ngày. \n" +
                    "\n" +
                    "Hỗ trợ sức khỏe tim mạch\n" +
                    "\n" +
                    "Không chỉ cá mà ốc cũng là nguồn cung cấp axit béo Omega-3 dồi dào. Omega-3 được chứng minh có tác dụng cải thiện sức khỏe tim mạch và giảm nguy cơ tử vong vì bệnh tim. Omega-3 cũng có thể hỗ trợ hạ huyết áp, giảm đông máu và giữ nhịp tim ổn định.\n" +
                    "\n" +
                    "Rủi ro tiềm ẩn \n" +
                    "\n" +
                    "Trong một số trường hợp, ăn ốc sống hoặc nấu chưa chín kỹ có thể dẫn đến tình trạng nhiễm ký sinh trùng. Bạn có thể bị nhức đầu, sốt, buồn nôn, nôn mửa. Những ký sinh trùng này làm tổn thương các cơ quan nội tạng như phổi, gan, thận, dẫn đến phản ứng miễn dịch hoạt động quá mức. \n" +
                    "\n" +
                    "Ốc nước ngọt là vật chủ của ký sinh trùng nguy hiểm gây bệnh sán máng. Mỗi năm, hàng triệu người trên thế giới nhiễm ký sinh trùng này qua nguồn nước bẩn. \n" +
                    "\n" +
                    "Bạn có thể ngăn ngừa nguy cơ trên bằng cách nấu ốc chín thật kỹ trước khi ăn. \n" +
                    "\n" +
                    "Ngoài ra, một số nhóm người không nên ăn ốc để tránh gây hại cho sức khỏe. Người mắc bệnh gút nên tránh các món từ ốc do hàm lượng purin cao, hấp thụ quá nhiều sẽ khiến tình trạng bệnh nặng hơn. Không ít người bị dị ứng với hải sản bao gồm ốc dẫn tới nổi mề đay, ngứa, phù nề mặt, đau bụng, tiêu chảy, khó thở. Các bệnh nhân cần đi cấp cứu và tuyệt đối tránh ăn ốc sau này.\n" +
                    "\n" +
                    "Do trong ốc có nhiều natri, nếu hấp thu nhiều sẽ khiến người mắc bệnh tiểu đường, thận, huyết áp cao nặng thêm. Ngoài ra, bà bầu cũng nên tránh món ăn này do ốc sống trong môi trường ao hồ, dễ nhiễm ký sinh trùng, ảnh hưởng tới sức khỏe của mẹ và thai nhi. ",
            "MỸ - Mỗi buổi sáng, chuyên gia tim mạch Vuppuluri đều có thói quen uống hai cốc nước lớn.\n" +
                    "Mỗi người thường có thói quen buổi sáng riêng chẳng hạn như thưởng thức cùng một loại đồ uống (cà phê, trà hoặc nước cam). Điều đó sẽ ảnh hưởng rất nhiều đến sức khỏe của bạn. Nếu muốn bắt đầu ngày mới theo cách có lợi cho tim mạch, bạn có thể tham khảo thói quen của bác sĩ Rohit Vuppuluri: \n" +
                    "\n" +
                    "Uống hai cốc nước lớn \n" +
                    "\n" +
                    "Tiến sĩ Vuppuluri nói rằng mỗi buổi sáng, ông đều có một thói quen đơn giản hỗ trợ sức khỏe tim mạch: uống hai cốc nước lớn. Ông giải thích: “Điều này giúp tôi bắt đầu ngày mới với lượng nước dồi dào và đánh thức tâm trí cũng như cơ thể của tôi”."+
                    "Theo Parade, vị chuyên gia cho biết quá trình hydrat hóa (bổ sung nước) và sức khỏe tim mạch có mối liên hệ quan trọng: “Nước rất cần thiết để duy trì chức năng tim và nhịp tim ổn định. Nghiên cứu khoa học cho thấy mối liên hệ giữa lượng nước trong cơ thể thấp và nguy cơ mắc bệnh tim. Thiếu nước có thể gây viêm trong cơ thể, tác động tiêu cực đến tim”.\n" +
                    "\n" +
                    "Cơ thể đủ nước cũng tốt cho việc kiểm soát huyết áp. Khi cơ thể thiếu nước, các mạch máu sẽ co lại, làm tăng huyết áp, tăng nguy cơ đau tim và đột quỵ.\n" +
                    "\n" +
                    "Do đó, bắt đầu ngày mới bằng 2 ly nước đầy là một thói quen tốt cho tim mạch mà bạn dễ dàng áp dụng. \n" +
                    "\n" +
                    "Ba thói quen khác tốt cho tim \n" +
                    "\n" +
                    "Uống một tách cà phê\n" +
                    "\n" +
                    "Ngoài nước, uống một tách cà phê vào buổi sáng cũng có thể hỗ trợ sức khỏe tim mạch. Tiến sĩ Vuppuluri giải thích: “Cà phê có chất chống oxy hóa tốt cho tim mạch”. Uống cà phê ở mức độ vừa phải có liên quan đến giảm nguy cơ tử vong do tim mạch. Như các thói quen khác, điều độ là chìa khóa quan trọng. Uống 4 tách cà phê trở lên mỗi ngày được cho là có tác động tiêu cực đến tim.\n" +
                    "\n" +
                    "Tiến sĩ Vuppuluri cũng nhấn mạnh tác dụng của cà phê ở mỗi người là khác nhau. Nếu bạn là người rất nhạy cảm với caffeine, tốt nhất bạn nên chọn cà phê decaf (vẫn có chất chống oxy hóa nhưng không có caffeine)."+
                    "Ăn bữa sáng cân bằng \n" +
                    "\n" +
                    "Tiến sĩ Vuppuluri khuyên bạn nên chọn ngũ cốc nguyên hạt, protein nạc và nước hoặc nước ép trái cây tươi để có nhiều chất dinh dưỡng hỗ trợ sức khỏe tim mạch. Ví dụ, chất xơ trong bột yến mạch (ngũ cốc nguyên hạt) và trái cây giúp giảm cholesterol và huyết áp. Protein trong các loại hạt, sữa chua Hy Lạp, phô mai và trứng tốt cho sức khỏe tim mạch hơn xúc xích, thịt xông khói. \n" +
                    "\n" +
                    "Đi dạo\n" +
                    "\n" +
                    "Hiệp hội Tim mạch Mỹ khuyến nghị mọi người nên tập thể dục ở mức độ trung bình trở lên ít nhất 2,5 giờ mỗi tuần. Nếu không có thời gian, bạn có thể đi dạo quanh khu nhà cũng tốt cho tim mạch. "

        )
        recView = view!!.findViewById(R.id.recyclerView)
        recView.layoutManager = LinearLayoutManager(requireActivity())

        recView.setHasFixedSize(true)


        itemArrayList = arrayListOf()

        getData()

        recView.adapter = RecAadapter(itemArrayList)

        return view
    }
    private fun getData() {

        for (i in imageId.indices) {
            val pizza = News(imageId[i], names[i], ingredients[i])
            itemArrayList.add(pizza)
        }
    }
}
