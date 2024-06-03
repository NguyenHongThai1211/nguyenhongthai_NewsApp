package com.example.myapplication.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.News
import com.example.myapplication.ui.adapter.RecAadapter

class Sac_depFragment : Fragment() {
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
            R.drawable.hoahaungocchau,
            R.drawable.thammy,
            R.drawable.collagen,
            R.drawable.moi,
            R.drawable.caubedepnhatthegioi,
            R.drawable.taythi,
            R.drawable.sacdep,
            R.drawable.suadaunanh,
            R.drawable.netdep,
        )

        names = arrayOf(
            "Hoa hậu Ngọc Châu truyền tải thông điệp 'Sẵn sàng cho vương miện'",
            "Thương hiệu thẩm mỹ JK có mặt tại Việt Nam",
            "Collagen quan trọng thế nào với sắc đẹp, sức khỏe?",
            "Tiêu chuẩn bờ môi được khao khát nhất thế giới",
            "Đời gập ghềnh của 'cậu bé đẹp nhất thế giới'",
            "Bí quyết chăm sóc sắc đẹp của nàng Tây Thi",
            "Hội thảo sức khỏe và sắc đẹp với giáo sư đầu ngành",
            "Khỏe đẹp từ sữa đậu nành",
            "Chăm sóc đúng cách để có làn da tươi trẻ",
        )

        ingredients = arrayOf(
            "Với vai trò đại sứ nhan sắc cho thẩm mỹ viện SeoulSpa.Vn, Ngọc Châu mong muốn phụ nữ luôn biết phát huy giá trị bản thân để trở thành “hoa hậu” của chính mình.\n" +
                    "\n" +
                    "Đương kim hoa hậu Hoàn vũ Việt Nam Ngọc Châu chính thức trở thành đại sứ đại diện nhan sắc cho thẩm mỹ viện SeoulSpa.Vn từ ngày 10/9/2022. Trong vai trò mới, Hoa hậu Ngọc Châu, chia sẻ cô mong muốn cùng SeoulSpa.Vn truyền tải thông điệp \"Sẵn sàng cho vương miện\" với nhiều góc nhìn về vẻ đẹp của người phụ nữ. Theo đó, mỗi người phụ nữ đều sở hữu những nét đẹp riêng biệt và họ là duy nhất, việc theo đuổi chinh phục được những giá trị này là cách giúp họ tỏa sáng và luôn là \"hoa hậu\" của chính mình.\n" +
                    "\n" +
                    "\"Có người phụ nữ chọn cho mình vương miện của thành đạt với sự bản lĩnh, mạnh mẽ. Có người lại chọn vương miện của sự sẻ chia với những giá trị tích cực mang đến cho cộng đồng. Người khác lại chọn vương miện của sự an yên khi đề cao giá trị gia đình. Tựu chung, mỗi người phụ nữ đều sẽ chạm đến đỉnh cao của cái đẹp theo cách riêng của họ\" Hoa hậu Ngọc Châu nói."+
            "Tại buổi lễ công bố Đại sứ Nhan sắc, đại diện thẩm mỹ viện SeoulSpa.Vn cho biết, Hoa hậu Ngọc Châu là người tài sắc, phù hợp với tinh thần và sứ mệnh mà SeoulSpa.Vn hướng đến để phục vụ khách hàng.\n" +
                    "\n" +
                    "\"SeoulSpa.Vn mong muốn lan tỏa nhiều hơn về định nghĩa của vương miện, không chỉ dừng ở khía cạnh nhan sắc. Vương miện ở đây là những giá trị tốt đẹp mà mỗi người phụ nữ chọn lựa để khắc họa con người chính mình. Vì vậy, phụ nữ hãy chuẩn bị một tâm thế sẵn sàng và tìm kiếm cho mình người đồng hành tốt nhất trên hành trình chinh phục những điều tốt đẹp, như cách Hoa Hậu Ngọc Châu đã thực hiện\", đại diện SeoulSpa.Vn cho biết."+
            "Theo Hoa hậu Ngọc Châu, quan điểm sống của cô luôn gắn với hay từ \"sẵn sàng\", sẵn sàng chuẩn bị trước những kỹ năng, hoàn thiện bản thân, sẵn sàng đón nhận thử thách. Tương tự như cách thẩm mỹ viện SeoulSpa.Vn hướng đến là sẵn sàng thay đổi, sẵn sàng cập nhật công nghệ mới, sẵn sàng phục vụ khách hàng, sẵn sàng chia sẻ với cộng đồng."+
            "Thẩm mỹ viện SeoulSpa.Vn mang triết lý nuôi dưỡng vẻ đẹp từ tâm hồn, hoàn thiện sắc vóc từ bên ngoài và không ngừng nâng cấp các trải nghiệm tuyệt vời cho khách hàng. Đơn vị mong muốn sẽ trở thành người đồng hành cùng phụ nữ Việt Nam để chinh phục được giá trị mà mình theo đuổi.\n" +
                    "\n" +
                    "Trước đó, Nghệ sĩ Việt Hương đã đồng hành cùng SeoulSpa.Vn với vai trò Đại sứ Thương hiệu, tạo nên mảnh ghép của vẻ đẹp từ Tâm.",
            "Sau hơn một thập kỷ theo đuổi dự án, Hoa hậu Hà Kiều Anh chính thức khai trương Thẩm mỹ viện JK Imperial Beauty Center, ngày 18/09.\n" +
                    "\n" +
                    "Sáng ngày 18/9, lễ khai trương JK Imperial Beaty Center với chủ đề \"EverLasting Beauty -Vẻ đẹp bền lâu\" diễn ra tại quận 1, TP HCM thành công tốt đẹp. Đây là buổi lễ đánh dấu thương hiệu thẩm mỹ JK Plastic Surgery Korea thuộc tập đoàn JK Medical Group về Việt Nam. Hoa hậu Hà Kiều Anh và Imperial Group theo đuổi dự án này gần một thập kỷ."+
            "Buổi lễ có sự tham dự của của Dr. Joo Kwoon - Chủ tịch JK Plastic Surgery Korea, Phó Giám đốc Sở Y tế TP HCM Nguyễn Hoài Nam, một số bác sĩ, y tá kỳ cựu, khách hàng và tất cả nhân viên JK Imperial."+
            "Phát biểu tại buổi khai trương, ông Dr. Joo Kwoon - Chủ tịch JK Plastic Surgery Korea, cho biết đây là buổi lễ nhiều cảm xúc. Hành trình đưa thương hiệu thẩm mỹ JK về Việt Nam đã được đền đáp bằng trái ngọt.\n" +
                    "\n" +
                    "\"13 năm trước, tôi và Hoa hậu Hà Kiều Anh gặp nhau với mối quan hệ bác sĩ và khách hàng. Nhưng hiện nay, là hợp tác làm việc như một gia đình. Chúng ta có ước mơ chung là đem dịch vụ chăm sóc y tế thẩm mỹ, làm đẹp khác biệt đến với mọi người. Tôi rất cảm kích vì nhờ có Hoa hậu - CEO Hà Kiều Anh mà triết lý của JK \"ứng dụng công nghệ tiên tiến để tạo ra giá trị tốt đẹp cho thế giới\" cũng đã được thực hiện tại Việt Nam.\" – ông Dr. Joo Kwoon chia sẻ.\n" +
                    "\n" +
                    "Nằm trong chuỗi sự kiện khai trương chính thức JK Imperial Beaty Center, Gala Grand Opening là đêm tiệc tôn vinh và tri ân quan khách, đại gia đình JK, khách hàng, bạn bè, đối tác..."+
            "Trong đêm tiệc đặc biệt này, CEO Hà Kiều Anh, chia sẻ nữ doanh nhân và ekip dự án đã dành rất nhiều tâm tư, trăn trở, vượt qua không biết bao nhiêu khó khăn suốt một thập kỷ để đưa thương hiệu thẩm mỹ JK về Việt Nam. Cuối cùng giấc mơ lớn này đã thành hiện thực.\n" +
                    "\n" +
                    "\"Chính tại quê hương Việt Nam, khách hàng sẽ có được trải nghiệm thẩm mỹ cao cấp, mà sự hiệu quả được đề lên hàng đầu. Đó chính là sự hoàn hảo mà chúng tôi dành cho khách hàng.\" Hoa hậu Hà Kiều Anh - CEO JK Imperial Beauty Center chia sẻ.\n" +
                    "\n" +
                    "Tại buổi tiệc, JK đã xây dựng quỹ \"JK Plastic Surgery Korea – JK Imperial New Face New Dream\" để tài trợ và giúp đỡ cho các trường hợp không may mắn gặp sự cố, tai nạn. 10% lợi nhuận của Gala Grand Opening sẽ được đóng góp vào quỹ này."+
            "Đêm tiệc ý nghĩa này như một lời cảm ơn sâu sắc và định vị thương hiệu thẩm mỹ JK Imperial đẳng cấp, luôn mang đến những giá trị tốt đẹp nhất cho mọi người.",
            "Bên cạnh việc tạo độ đàn hồi cho làn da, collagen giúp bảo vệ sức khỏe tim mạch, xương khớp, khối lượng cơ.\n" +
                    "\n" +
                    "Collagen là một loại protein, chiếm 70% cấu trúc da, phân bổ chủ yếu ở lớp hạ bì của da. Dưỡng chất có vai trò quan trọng với sức khỏe, làn da, mạch máu, xương khớp, mắt, theo Healthline.\n" +
                    "\n" +
                    "Cải thiện sức khỏe làn da\n" +
                    "\n" +
                    "Collagen là một thành phần chính của làn da. Dưỡng chất đóng một vai trò trong việc củng cố làn da, độ đàn hồi và hydrat hóa. Khi già đi, cơ thể sản xuất ít collagen hơn, dẫn đến da khô, hình thành các nếp nhăn.\n" +
                    "\n" +
                    "Tuy nhiên, một số nghiên cứu chỉ ra rằng collagen peptide hoặc chất bổ sung có chứa collagen có thể giúp làm chậm quá trình lão hóa da bằng cách giảm nếp nhăn và khô da. Một đánh giá của 11 nghiên cứu tập trung chủ yếu vào phụ nữ cho thấy rằng uống 3-10 gam collagen mỗi ngày trong trung bình 69 ngày giúp cải thiện độ đàn hồi, hydrat hóa của da.\n" +
                    "\n" +
                    "Những chất bổ sung này có thể hoạt động bằng cách kích thích cơ thể tự sản xuất collagen. Ngoài ra, các chất bổ sung collagen có thể thúc đẩy sản xuất các protein khác trong tế bào da, bao gồm elastin và fibrillin.\n" +
                    "\n" +
                    "Giảm đau khớp\n" +
                    "\n" +
                    "Collagen giúp duy trì tính toàn vẹn của sụn, mô, giúp bảo vệ khớp. Khi lượng collagen trong cơ thể giảm dần theo tuổi tác, nguy cơ mắc các chứng rối loạn thoái hóa khớp như viêm xương khớp sẽ tăng lên .\n" +
                    "\n" +
                    "Một số nghiên cứu cho thấy bổ sung collagen có thể giúp cải thiện các triệu chứng của viêm xương khớp, giảm đau khớp tổng thể. Một đánh giá về năm nghiên cứu ở hơn 500 người bị viêm xương khớp cho thấy, uống khoảng 10 gam collagen mỗi ngày trong trung bình 24 tuần giúp cải thiện đáng kể về độ cứng khớp, chứng đau khớp.\n" +
                    "\n" +
                    "Các nhà nghiên cứu đưa ra giả thuyết rằng, collagen bổ sung có thể tích tụ trong sụn, kích thích các mô tạo ra collagen. Đổi lại, điều này có thể dẫn đến giảm viêm, hỗ trợ khớp tốt hơn, giảm đau."+
            "Ngăn ngừa mất xương\n" +
                    "\n" +
                    "Giống như collagen trong cơ thể suy giảm theo tuổi tác, khối lượng xương cũng vậy. Điều này có thể dẫn đến các tình trạng như loãng xương, mật độ xương thấp và nguy cơ gãy xương cao hơn.\n" +
                    "\n" +
                    "Các nghiên cứu lưu ý rằng bổ sung collagen có thể giúp ức chế sự phân hủy xương dẫn đến loãng xương. Trong một nghiên cứu kéo dài 12 tháng, phụ nữ uống bổ sung canxi, 5 gam collagen hoặc bổ sung canxi và không bổ sung collagen hàng ngày.\n" +
                    "\n" +
                    "Vào cuối nghiên cứu, những người bổ sung canxi và collagen có nồng độ protein thúc đẩy quá trình phân hủy xương trong máu thấp hơn đáng kể so với những người chỉ bổ sung canxi. Một nghiên cứu khác cho thấy kết quả tương tự ở 66 phụ nữ uống 5 gam collagen mỗi ngày trong 12 tháng. Những người uống collagen đã tăng mật độ khoáng xương (BMD) lên đến 7% so với những người không uống collagen. BMD là thước đo mật độ khoáng chất, chẳng hạn như canxi trong xương. BMD thấp có liên quan đến xương yếu, nguy cơ loãng xương.\n" +
                    "\n" +
                    "Tăng cường khối lượng cơ\n" +
                    "\n" +
                    "Collagen là một loại protein dồi dào trong cơ thể, là một thành phần quan trọng của cơ xương. Các nghiên cứu cho thấy chất bổ sung collagen giúp tăng cường khối lượng cơ ở những người bị chứng suy giảm cơ bắp, tình trạng mất khối lượng cơ xảy ra theo tuổi tác.\n" +
                    "\n" +
                    "Trong một nghiên cứu kéo dài 12 tuần, 27 người đàn ông mắc chứng này uống 15 gam collagen trong khi tham gia chương trình tập thể dục hàng ngày. So với những người đàn ông tập thể dục nhưng không bổ sung collagen, họ có được khối lượng cơ, sức mạnh.\n" +
                    "\n" +
                    "Các nhà nghiên cứu gợi ý rằng, collagen có thể thúc đẩy sự tổng hợp các protein cơ như creatine, cũng như kích thích sự phát triển của cơ bắp sau khi tập thể dục.\n" +
                    "\n" +
                    "Thúc đẩy sức khỏe tim mạch\n" +
                    "\n" +
                    "Các nhà nghiên cứu đưa ra giả thuyết rằng bổ sung collagen có thể giúp giảm nguy cơ mắc các bệnh về tim. Nếu không có đủ collagen, các động mạch có thể trở nên kém linh hoạt và đàn hồi. Điều này có thể dẫn đến xơ vữa động mạch, một căn bệnh đặc trưng bởi sự thu hẹp các động mạch. Tình trạng này có thể dẫn đến đau tim và đột quỵ.\n" +
                    "\n" +
                    "Trong một nghiên cứu kéo dài 6 tháng, 31 người trưởng thành khỏe mạnh đã bổ sung 16 gam collagen mỗi ngày. Họ đã giảm đáng kể số đo độ cứng của động mạch từ khi bắt đầu đến khi kết thúc nghiên cứu. Ngoài ra, mức cholesterol HDL (tốt) của họ tăng trung bình 6%.",
            "Các nhà khoa học phát hiện đôi môi đầy đặn với môi dưới lớn gấp 2 môi trên là lý tưởng, quyến rũ nhất.\n" +
                    "\n" +
                    "Kỹ thuật thẩm mỹ hiện đại ngày nay có thể chỉnh sửa bất cứ thứ gì trên khuôn mặt bạn, bao gồm cả đôi môi. Giờ đây, để giúp đỡ chị em chọn được kiểu dáng, kích thước khuôn miệng ưng ý, tạp chí JAMA Facial Plastic Surgery đã tìm ra tiêu chuẩn bờ môi được khao khát nhất thế giới.\n" +
                    "\n" +
                    "Theo Medical Daily, các nhà khoa học phát hiện đôi môi quyến rũ nhất là đôi môi đã tăng 53,5% diện tích bề mặt so với ban đầu và chiếm 10% một phần ba phía dưới của khuôn mặt. Bên cạnh đó, tỷ lệ môi trên so với môi dưới là 1:2."+
            "Cả đàn ông lẫn phụ nữ đều ưa thích môi đầy đặn mà không quá lớn. Đặc biệt, tỷ lệ 1:2 của đôi môi mà các nhà khoa học đưa ra trái ngược hẳn với trào lưu bơm môi trên của giới trẻ thế giới dẫn đầu bởi ngôi sao thực tế Kylie Jenner.\n" +
                    "\n" +
                    "Tất nhiên, nghiên cứu còn nhiều hạn chế như chỉ dựa trên đặc điểm tự nhiên của phụ nữ da trắng. Ngoài ra, vì chưa có hướng dẫn cụ thể, bơm môi vẫn chủ yếu dựa trên kinh nghiệm bác sĩ.",
            "Vẻ đẹp phi giới tính cùng vai diễn trong bộ phim Death in Venice đã khiến cuộc đời Bjorn Andresen ba chìm, bảy nổi.\n" +
                    "\n" +
                    "Sinh năm 1955, tại Stockholm (Thụy Điển), Bjorn Andresen có một tuổi thơ bất hạnh khi sinh ra ngoài giá thú, mẹ tự tử năm lên 10, cậu ở với cha dượng. Khi 15 tuổi, vẻ đẹp của Bjorn đã vượt qua hơn 3.000 ứng viên để được chọn vào vai diễn Tadzio trong bộ phim Death in Venice (Chết ở Venice). Phim kể về một nghệ sĩ thăm thú thành phố Venice, trong chuyến đi đó ông đã say mê trước vẻ đẹp của cậu bé tên Tadzio.\n" +
                    "\n" +
                    "Nhiều người nói Bjorn sinh ra là để dành cho vai diễn này. Ở tuổi 15, Bjorn mang một gương mặt xinh đẹp y hệt những gì được miêu tả về Tadzio: \"Gương mặt cậu trắng muốt và mang một vẻ thanh tao, mái tóc vàng như mật ong, sống mũi thẳng thanh tú, cái miệng chúm chím đáng yêu, sắc mặt lạnh lùng và thánh thiện làm người ta liên tưởng đến những tác phẩm điêu khắc Hy Lạp thời hoàng kim...\"."+
            "Bộ phim đã thành công vang dội. Bjorn Andresen được mệnh danh \"Cậu bé xinh đẹp nhất thế giới\". Một số người nói rằng vẻ đẹp của Bjorn là \"một thảm họa, gần như là sức mạnh hủy diệt và mọi người thấy nhỏ bé trước chàng thiếu niên\". Nhà sử học điện ảnh Lawrence đã nhận xét rằng một số hình ảnh của Bjorn trong phim \"có thể được trích xuất thành tranh treo trên các bức tường của Viện bảo tàng Louvre hoặc Tòa thánh Vatican\".\n" +
                    "\n" +
                    "Nhưng cũng chính vì khuôn mặt trong vai diễn ấy mà Bjorn phải nhận nhiều cái nhìn thèm thuồng của những gã trai gay khi đạo diễn dẫn cậu vào một bar cho người đồng tính tại liên hoan phim Cannes năm 1970. \"Tôi cảm thấy mình như một con thú hiếm trong lồng. Những người phục vụ nhìn tôi như miếng mồi ngon\", Bjorn nói.\n" +
                    "\n" +
                    "Người tình đồng tính của vị đạo diễn ghen ghét với Bjorn đã tạo ra vô số tin đồn về cậu. Những năm 70, khi người đồng tính vẫn bị kỳ thị, những tin đồn đã khiến cậu bị ghét bỏ, không thể trụ lại kinh đô điện ảnh thế giới mà phải tới Nhật Bản.\n" +
                    "\n" +
                    "Không chỉ thế, cậu cũng nhiều lần bị ám sát hụt trong các vụ tai nạn xe hơi, tai nạn hàng không, lạm dụng ma túy. Năm 1976, cậu vô tình dính líu vào một vụ án giết người. Bjorn không thích đàn ông và đã nhiều lần thanh minh cho mình nhưng không ai tin.\n" +
                    "\n" +
                    "Bjorn từng thu âm hai đĩa CD, bốn bài hát và nhiều quảng cáo truyền hình ở Nhật Bản. Nhưng bất kể anh đi đâu cũng không thể xé bỏ danh hiệu \"Chú bé đẹp nhất thế giới\". Ở Nhật, Bjorn trở thành nguyên mẫu của một số nhân vật hoạt hình kinh điển vì khuôn mặt đẹp của mình.\n" +
                    "\n" +
                    "Âm nhạc không giúp Bjorn thành công. Trong những năm tiếp theo, anh đã cố gắng trở lại với vài bộ phim nhưng chỉ là những vai phụ.\n" +
                    "\n" +
                    "Vai diễn Tadzio ảnh hưởng suốt cuộc đời Bjorn. Anh từng nói: \"Tôi không thể chờ đợi để lên thiên đàng. Tôi được sinh ra với khuôn mặt như vậy, nhưng không thể hỏi Chúa tại sao\"."+
            "Năm 1983 nam diễn viên kết hôn và có hai gái, một trai. Song Bjorn chỉ có hạnh phúc ngắn ngủi trong 6 năm, bởi sau cái chết của con trai vì hội chứng đột tử thì vợ anh muốn ly hôn. Đây là khoảng thời gian đen tối nhất trong cuộc đời Bjorn. Anh bắt đầu uống rượu, sau đó mất công việc trong nhà hát.\n" +
                    "\n" +
                    "Trong cuộc phỏng vấn với giới truyền thông trong giai đoạn này, Bjorn nói không hối hận khi tham gia bộ phim \"Chết ở Venice\". \"Nhưng nếu tôi 15 tuổi mà biết rằng cuộc sống sẽ trở nên như thế này, tôi nghĩ mình sẽ từ chối\", anh nói.\n" +
                    "\n" +
                    "Bjorn nói, đến tuổi 50 ông mới không còn thấy sợ hãi khi nhìn thấy hình Tadzio trên những tấm poster quảng cáo. Tuy nhiên hơn chục năm trước, khi nhà văn Mỹ Germaine Greer sử dụng hình ảnh của ông làm bìa cuốn sách mới của cô nói về những cậu bé xinh đẹp mà không hỏi ý kiến, Bjorn thực sự rất tức giận, như thể nỗi ám ảnh bao năm giờ quay trở lại. \n" +
                    "\n" +
                    "Khi được hỏi ông có đồng ý nếu nữ nhà văn Germaine Greer có xin phép, Bjorn đáp: \"Tất nhiên không. Trừ khi địa ngục làm tôi đóng băng\"."+
                    "Những năm gần đây ông sống ở Stockholm với hai con gái và các cháu gái của mình, ít xuất hiện trước truyền thông. Thi thoảng vẫn có những người tò mò muốn gặp ông.",
            "Mỹ nhân thời Xuân Thu Trung Quốc dùng trứng gà đắp mặt, nhằm kiềm dầu, dưỡng ẩm, mờ nếp nhăn.\n" +
                    "\n" +
                    "Tây Thi được xưng tụng là một trong tứ đại mỹ nhân Trung Hoa những năm 490 trước công nguyên. Ngày nay, những bí quyết làm đẹp của Tây Thi vẫn được lưu truyền ở Trung Quốc."+
                    "Dưỡng da bằng trứng gà\n" +
                    "\n" +
                    "Trước tiên rửa mặt sạch, lấy một phần tư lòng đỏ và lòng trắng trứng gà sau đó nghiền và thoa đều trên mặt. Đợi 15 phút để da hấp thụ dưỡng chất từ trứng gà rồi rửa sạch mặt bằng nước ấm. Cuối cùng, xoa chất dưỡng ẩm làm từ mật ong và hoa hồng.\n" +
                    "\n" +
                    "Mặt nạ trứng gà giúp kiềm dầu, dưỡng ẩm và mờ nếp nhăn, chống thâm. Phương pháp này cũng được Từ Hy thái hậu thời nhà Thanh sử dụng.\n" +
                    "\n" +
                    "Người từ 20-30 tuổi nên đắp trứng gà 2 lần mỗi tuần. Người từ 30 tuổi trở lên được khuyến khích dùng 3 tuần một lần.\n" +
                    "\n" +
                    "Phương pháp giảm tàn nhang\n" +
                    "\n" +
                    "Vỏ cây chi tần (cây họ ô liu) kết hợp với nước gạo và thêm lòng trắng trứng, sau đó đun lên và để nguội. Dùng nước này rửa mặt buổi sáng hàng ngày sẽ giúp tàn nhang dần mờ đi và biến mất.\n" +
                    "\n" +
                    "Bí quyết pha nước tắm\n" +
                    "\n" +
                    "Lấy nấm trư linh, cỏ hoắc hương, cỏ thơm, hai lá sen khô, cam thảo, hoa mẫu đơn trắng đun với nước. Mỗi ngày tắm một lần, qua một tháng làn da sẽ mềm mịn hơn. Cỏ hoắc hương kết hợp với các loại dược liệu khác giúp giảm mùi hôi cơ thể.\n" +
                    "\n" +
                    "Phương pháp làm trắng răng\n" +
                    "\n" +
                    "Giã hỗn hợp gồm trầm hương, xạ hương, tế tân (thuốc chữa bệnh đau răng), cảo bản (có tác dụng chống viêm), cam túc, thạch cao và trộn đều với nước lạnh. Mỗi ngày bôi hỗn hợp lên răng, sau đó rửa sạch bằng nước. Bài thuốc này hiện vẫn được các thầy thuốc Đông y sử dụng.",
            "Làm cách nào để chăm sóc sức khỏe và sắc đẹp từ bên trong, từ đó duy trì nét tươi trẻ là điều mà các chuyên gia muốn gửi đến phái đẹp thông qua hội thảo ngày 2/10 tới.\n" +
                    "\n" +
                    "Sắc đẹp là món quà tạo hóa đã ưu ái dành tặng chị em. Tuy nhiên, từ sau tuổi 30, phái đẹp bắt đầu thấy lo lắng cho sức khỏe và nhan sắc. Bởi giai đoạn lão hóa khiến hệ trục não bộ, tuyến yên, buồng trứng bắt đầu suy giảm và để lại dấu ấn lên làn da, dáng vóc cũng như thể chất của mỗi người.\n" +
                    "\n" +
                    "Bước vào thời kỳ này, chị em sẽ cảm nhận được những dấu hiệu đang ngại như làn da xuất hiện nếp nhăn, khô ráp, mất đi tính đàn hồi và độ mịn màng vốn có; tóc trở nên dễ gãy rụng, xơ xác và mỏng đi trông thấy; vóc dáng kém thon gọn, dễ tăng cân, nhiều trường hợp còn rơi vào tình trạng thừa mỡ, béo phì; rối loạn giấc ngủ, tình trạng bốc hỏa, tâm lý bất ổn, trí nhớ giảm sút... Những thay đổi về tâm sinh lý khiến phái đẹp dần mất nét tươi trẻ."+
                    "Vì vậy, việc giữ gìn sức khỏe và bảo vệ sắc đẹp trước mọi ảnh hưởng của thời gian là mối quan tâm hàng đầu của chị em. Các biện pháp chăm sóc nhan sắc từ bên ngoài có ích, nhưng chỉ là một phần bởi sự rạng rỡ và tươi trẻ sẽ chỉ phát huy khi được chăm sóc, nuôi dưỡng từ bên trong."+
                    "Vào 9h ngày 2/10, Hội thảo chuyên đề \"Tái tạo tế bào, hồi sinh sức khỏe và sắc đẹp\" được tổ chức tại Bệnh viện thẩm mỹ Á Âu với sự tham gia của các chuyên gia đầu ngành đến từ Nga và Nhật Bản. Tại đây, các chuyên gia sẽ chia sẻ với phái đẹp những biện pháp, lời khuyên nhằm giúp chị em chống lại các tác nhân lão hóa và ngày càng khỏe mạnh, trẻ trung, tràn đầy sức sống từ bên trong."+
                    "Bạn có thể đăng ký tham dự hội thảo ngay hôm nay tại số hotline 0906 82 70 70 và 0902 400 269 để được giao lưu cùng các chuyên gia và được tư vấn, thăm khám, nhận miễn phí 100% dịch vụ chăm sóc da CC Skin.",
            "Ngoài giá trị dinh dưỡng, sữa đậu nành còn được nhiều phụ nữ lựa chọn như phương pháp làm đẹp hiệu quả mà tiết kiệm.\n" +
                    "\n" +
                    "Đậu nành là loại thực phẩm phổ biến và quen thuộc trong cuộc sống hàng ngày của gia đình Việt. Nó vừa là đồ uống giải khát vào mùa hè nóng bức vừa giúp nâng cao sức khỏe. Thực phẩm này chứa nhiều axit béo, đạm, xơ, vitamin và khoáng chất. Với hàm lượng dinh dưỡng cao, đậu nành giúp nữ giới khỏe đẹp, đồng thời phòng ngừa và cải thiện một số vấn đề sức khỏe. Theo đó, hoạt chất Isoflavones có trong đậu nành giúp giảm nếp nhăn trên da mặt, tăng cường kết nối collagen để cải thiện màu da. Phụ nữ cũng có thể có làn da trắng sáng và tươi trẻ khi uống điều độ.\n" +
                    "\n" +
                    "Ngoài ra, thực phẩm này còn giúp cân bằng nội tiết tố, hạn chế tích tụ chất béo, giúp vóc dáng phụ nữ được mềm mại, khỏe khoắn. Axit không béo bão hòa trong sữa đậu nành cũng giúp chuyển hóa và điều chỉnh quá trình tiêu hóa thức ăn, làm tiêu hao thay vì lưu trữ chất béo. Đặc biệt đồ uống này còn có hàm lượng đường tự nhiên thấp hơn sữa bò và lượng calo tương đương sữa tách béo. Việc bổ sung sữa đậu nành vào thực đơn giảm cân là một lựa chọn khoa học giúp kiểm soát cân nặng hiệu quả."+
                    "Uống sữa đậu nành còn giúp cơ thể tăng khả năng cân bằng estrogen ở phụ nữ độ tuổi tiền mãn kinh, cải thiện tình trạng loãng xương do giảm nồng độ estrogen trong máu và thiếu hụt canxi. Công dụng đặc biệt khác của nó là ngăn ngừa các bệnh ung thư có liên quan tới hormon như ung thư vú, ruột. Đậu nành cũng có thể phòng chống bệnh tim mạch bằng cách làm giảm lượng cholesterol toàn phần và lượng cholesterol xấu, ngăn ngừa việc hình thành các mảng xơ vữa động mạch ở thành mạch máu, dẫn đến các chứng đột quỵ và nhồi máu cơ tim.\n" +
                    "\n" +
                    "Với những công dụng trên, sữa đậu nành là thực phẩm tốt của nữ giới khi muốn chăm sóc sức khỏe và sắc đẹp. Chị em có thể dễ dàng chế biến tại nhà với công thức đơn giản. Tuy nhiên, đối với người bận rộn, sản phẩm đóng hộp và được chế biến sẵn là một lựa chọn phù hợp, tiện lợi, hợp vệ sinh mà vẫn đảm bảo giữ trọn vị ngon, giàu dưỡng chất.\n" +
                    "\n" +
                    "Bí quyết để có sữa đậu nành giàu dưỡng chất thơm ngon là ở chất lượng nguyên liệu đậu nành khi đưa vào sản xuất. Các chuyên gia dinh dưỡng NutiFood đánh giá cao nguồn nguyên liệu trồng ở vùng đất đỏ bazan. Chúng giúp làm ra sản phẩm sữa đậu nành có mùi thơm, vị tự nhiên, hơn.\n" +
                    "\n" +
                    "Từ đó, NutiFood và Viện Khoa học kỹ thuật Nông nghiệp miền Nam đã hợp tác nghiên cứu tạo ra giống đậu nành phát triển từ các giống địa phương quý hiếm hương vị đặc trưng của vùng đất đỏ bazan. Đây là một mô hình hợp tác lý tưởng giữa nhà khoa học, nông dân và nhà sản xuất để tạo ra giống đậu ưu việt, cung cấp nguyên liệu đạt tiêu chuẩn cao cho nhà sản xuất.",
            "'Mãi mãi tuổi 30' là liệu pháp đặc biệt giúp mọi người gìn giữ tuổi xuân. Liệu pháp này nên thực hiện thường xuyên, 1-2 tuần một lần.\n" +
                    "\n" +
                    "Thời gian được coi là “kẻ thù” của tuổi xuân và sắc đẹp. Vì vậy, hàng nghìn năm qua, ước nguyện kéo dài tuổi xuân, có một cuộc sống trường thọ luôn là một trong những mục đích hướng tới của con người, đặc biệt là giới khoa học. Một trong những điều kỳ diệu của khoa học là biến những điều không thể thành có thể. “Mãi mãi tuổi 30” là liệu pháp đặc biệt giúp mọi người gìn giữ tuổi xuân."+
            "Độ tuổi sau 30 là độ tuổi chín muồi, viên mãn cả về sắc đẹp và hạnh phúc. Theo nghiên cứu do tạp chí Allure tiến hành ở Mỹ, phụ nữ được coi là rực rỡ và hấp dẫn hơn ở tuổi 30, trong khi đó, đàn ông bước vào “thời hoàng kim” ở tuổi 34. Nhưng, có một sự thật dù muốn dù không chúng ta cũng phải nhìn nhận là quá trình lão hóa bắt đầu hiển thị. Khi bước qua ngưỡng 30, người phụ nữ phải đối mặt với sự thay đổi của làn da theo chiều hướng xấu đi, sắc tố da xuất hiện khởi đầu có thể như những chấm tàn nhang, sau đó có thể chuyển sang mảng sắc tố, da không đồng màu.\n" +
                    "\n" +
                    "Các nếp nhăn li ti ở khóe miệng, đuôi mắt, cổ… bắt đầu xuất hiện nhiều hơn khi bước dần đến tuổi 40, 50. Những liên kết collagen và elastin của da bị thoái hóa, mỏng và thưa dần, khiến da đàn hồi kém, dẫn đến tình trạng chùng nhão, nhăn nheo, chảy xệ ở hai bên khóe miệng và bầu mắt dưới. Sự lưu thông máu, tuần hoàn cũng giảm làm chậm quá trình phục hồi da. Cùng lúc đó là sự xuất hiện của sạm nám, hậu quả của tình trạng stress kéo dài, những áp lực trong công việc, gia đình, con cái…"+
            "Dù không thể ngăn cản sự lão hóa của tự nhiên, nhưng theo bác sĩ Tôn Nữ Phương Thảo, bạn vẫn có thể cải thiện và làm chậm quá trình này bằng cách tác động vào 3 yếu tố là nguyên nhân gây lão hóa: ngăn ngừa da chảy xệ, ức chế sắc tố và kích thích liên tục sự tái tạo bề mặt da thông qua việc thực hiện liệu pháp “Mãi mãi tuổi 30\".\n" +
                    "\n" +
                    "Quy trình gồm 3 bước giúp ngăn ngừa và loại bỏ sắc tố bằng cách loại bỏ tế bào sắc tố hiện có, kích thích sự săn chắc các collagen hiện hữu và tăng cường hình thành các collagen mới. Toàn bộ cơ chế của Vital C peel plus O2 đạt được hiệu quả làm trắng sáng tối đa bằng cách bẻ gãy và mở rộng hàng rào tế bào để đưa oxy và vitamin C liều lượng cực cao vào sâu bên trong. Cơ chế electroporation giúp cho các dưỡng chất có thể thẩm thấu sâu, giúp cho da hấp thụ đồng loạt và toàn bộ các thành phần GA & AHAs, L-ascorbic acid, Oxygen, Plant stem cell collagen để nuôi dưỡng tế bào từ bên trong, làm cho da tươi trẻ, trắng sáng, săn chắc trở lại và căng tràn sức sống sau khi điều trị."+
            "Với liệu trình trị liệu mới, ứng dụng những công nghệ tiên tiến của khoa học, phương pháp trị liệu an toàn, thoải mái và hiệu quả nhanh chóng, liệu pháp “Mãi mãi tuổi 30” nên thực hiện thường xuyên, 1-2 tuần một lần như là một thói quen. Đây cũng là một phương pháp tập thể dục cho da cần duy trì trong cuộc sống để có làn da mịn màng, tươi trẻ, bất chấp tuổi tác và thời gian.\n" +
                    "\n" +
                    "Với những người trẻ tuổi, điều này dường như không có ý nghĩa nhiều, song đến khi bạn phải đối mặt với tuổi trung niên trở đi, những dấu hiệu lão hóa và tuổi già bắt đầu xuất hiện đe dọa đến nhan sắc và sự trẻ trung của cơ thể. Chính vì thế, sứ mệnh của “Mãi mãi tuổi 30” là giúp không chỉ phụ nữ mà cả nam giới hiểu rõ và trân trọng chính mình qua việc chăm sóc làn da từ sớm, để làm chậm quá trình lão hóa, và duy trì mãi làn da tuổi 30.",
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
            val new = News(imageId[i], names[i], ingredients[i])
            itemArrayList.add(new)
        }
    }
}
