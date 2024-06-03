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

class ThethaoFragment : Fragment() {
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
            R.drawable.chay,
            R.drawable.messi,
            R.drawable.goft,
            R.drawable.vdv,
            R.drawable.bongchuyen
        )

        names = arrayOf(
            "Mỹ nhân điền kinh Trung Quốc chạy 100m rào tốt nhất châu Á năm nay",
            "HLV Inter Miami muốn MLS đổi luật vì Messi",
            "Golfer 21 tuổi thắng ngoạn mục trên LPGA Tour",
            "Bố VĐV Nguyễn Minh Triết: 'Con được giải thoát khỏi những đau đớn'",
            "Chủ công Thanh Thuý muốn bóng chuyền Việt Nam vươn tầm thế giới"
        )

        ingredients = arrayOf(
            "NHẬT BẢNSau khi bị chỉ trích vì trang điểm đậm, mặc đồ gợi cảm khi thi đấu, Wu Yanni vô địch 100m rào nữ tại giải điền kinh Kinami Michitaka 2024."+
            "Ở vòng loại, Yanni chạy dưới 13 giây, đạt thành tích cá nhân tốt nhất mùa giải với 12 giây 91. Thành tích này vẫn kém xa thời gian cá nhân tốt nhất 12 giây 76 mà VĐV Trung Quốc thiết lập tại Đại học Thành Đô năm ngoái, nhưng đủ để giúp cô vào chung kết 100m rào nữ tại giải Điền kinh Kinami Michitaka Nhật Bản 2024.\n" +
                    "\n" +
                    "Vào chung kết tại Osaka ngày 12/5, Yanni chạy ở làn thứ năm và có thời gian phản ứng với hiệu lệnh xuất phát 0,162 giây - tệ nhất trong số tám VĐV tranh tài. Nhưng chân chạy Trung Quốc vẫn về nhất với 12 giây 86, phá kỷ lục của giải để đoạt danh hiệu ngoài trời đầu tiên trong mùa giải. 12 giây 86 cũng là thành tích tốt nhất của một VĐV châu Á ở nội dung 100m rào nữ trong năm 2024."+
            "Về nhì là VĐV từng phá kỷ lục quốc gia Nhật Bản Mako Fukube với 12 giây 92. HC đồng thuộc về Danielle Shaw của Australia với 12 giây 98. Ngoài ba người về nhất, những VĐV còn lại đều có thành tích chậm hơn 13 giây.\n" +
                    "\n" +
                    "Thời gian 12 giây 76 mà Yanni thiết lập tại Thành Đô năm ngoái là thành tích tốt thứ 11 trong lịch sử của VĐV châu Á ở nội dung 100m rào nữ. VĐV châu Á có thành tích tốt nhất ở cự ly này vẫn là Olga Shishigina của Kazakhstan với 12 giây 44 được thiết lập vào tháng 6/1995. Còn kỷ lục thế giới ở nội dung này là 12 giây 12 thuộc về Oluwatobiloba Amusan của Nigeria, lập năm 2022.\n" +
                    "\n" +
                    "Tháng trước, Yanni bị cộng đồng mạng chỉ trích vì trang điểm đậm, mặc đồ gợi cảm khi thi 100m rào và về bét ở cả hai sự kiện Diamond League tại Trung Quốc. Cụ thể, cô có thành tích 13 giây 4 tại Diamond League diễn ra ở Hạ Môn hôm 20/4 và 13 giây 15 tại Diamond League diễn ra ở Thượng Hải hôm 27/4."+
            "Theo trang 8world, dù không đạt thành tích tốt, việc tranh tài với nhiều elite tại Diamond League giúp Yanni tích lũy kinh nghiệm thi đấu. VĐV 26 tuổi cũng trải qua khóa huấn luyện đặc biệt khép kín trong nửa tháng qua, và đã gặt hái thành công tại Kinami Michitaka hôm qua.\n" +
                    "\n" +
                    "Yanni, sinh ngày 28/7/1997 tại Tự Cống - thành phố phía nam Tứ Xuyên, bắt đầu sự nghiệp chạy vượt rào ở Nội Giang trước khi chuyển đến học tại Đại học Thể thao Bắc Kinh. Cô được mệnh danh là \"nữ thần điền kinh của Trung Quốc\" và thu hút sự chú ý của mạng xã hội nhờ tính cách hướng ngoại và những hình xăm trên cơ thể. VĐV 26 tuổi cho rằng những hình xăm này biểu tượng cho sự tự tin của cô.\n" +
                    "\n" +
                    "Năm 2016, khi đại diện cho đội Tứ Xuyên ở nội dung 100m rào nữ tại Giải vô địch điền kinh quốc gia, Yanni giành vị trí thứ ba với 13 giây 58. Tại Đại hội Thể thao Toàn quốc lần thứ 13 tổ chức ở Thiên Tân, cô tiếp tục cán đích thứ ba với thành tích 13 giây 36."+
            "Yanni vô địch Trung Quốc năm 2023, vào chung kết Giải vô địch điền kinh châu Á 2023 được tổ chức tại Bangkok, nhưng bị loại do xuất phát sai. Cô giành HC bạc tại Đại hội Thể thao Đại học Thế giới ở Thành Đô vào tháng 8/2023, đạt thành tích cá nhân tốt nhất (PB) là 12 giây 85 ở bán kết. Ở chung kết sau đó, cô tiếp tục phá PB với 12 giây 76.\n" +
                    "\n" +
                    "Ở chung kết Đại hội thể thao châu Á 2022, Yanni lại bị loại vì xuất phát sai. Cô vừa góp mặt tại Giải vô địch điền kinh trong nhà thế giới năm 2024 ở Glasgow ở nội dung 60m rào, nơi cô đạt PB với 8 giây 12.",
            "MỸHLV Gerardo Martino muốn giải bóng đá Mỹ thay đổi, sau khi Lionel Messi phải đứng ngoài hai phút, không thể lập tức vào sân ở trận Inter Miami thắng ngược Montreal.\n" +
                    "\n" +
                    "Phút 40 trận đấu thuộc vòng 17, khi Inter Miami đang thua 0-2, Messi bị hậu vệ Montreal George Campbell phạm lỗi. Ngôi sao người Argentina phải rời sân để được chăm sóc y tế, còn Campbell bị thẻ vàng.\n" +
                    "\n" +
                    "Inter Miami được hưởng quả đá phạt với cự ly khoảng 25m, nhưng Messi không thể vào sân thực hiện vì luật \"Chăm sóc y tế ngoài sân\" của MLS. Tiền đạo 36 tuổi lắc đầu ngao ngán, quay về phía camera và nói \"Chúng ta đang làm một điều tồi tệ với loại quy tắc này\"."+
            "Theo luật \"Chăm sóc y tế ngoài sân\" được áp dụng từ tháng 4, nếu cầu thủ chấn thương nằm trên sân quá 15 giây, trọng tài sẽ dừng trận đấu và yêu cầu đội ngũ y tế vào sân. Nếu có thể tiếp tục thi đấu, cầu thủ này sẽ phải rời sân và ở ngoài tối thiểu hai phút để được đánh giá và điều trị thêm. Điều này nhằm tránh tình trạng cầu thủ câu giờ.\n" +
                    "\n" +
                    "Quy tắc này cũng có những ngoại lệ, trong trường hợp chấn thương ở đầu, chấn thương của thủ môn, tình trạng y tế nghiêm trọng và phạm lỗi dẫn đến thẻ vàng hoặc đỏ. Trong trường hợp của Messi, nếu cầu thủ của Montreal nhận thẻ vàng, luật hai phút ngoài sân sẽ không có hiệu lực.\n" +
                    "\n" +
                    "Martino không hài lòng và muốn MLS sửa luật. \"Tình huống đó, Messi rõ ràng bị phạm lỗi. Cầu thủ đối phương đáng nhận thẻ vàng, điều đó có nghĩa là Messi sẽ không bao giờ rời sân trong hai phút\", ông nói thêm. \"Theo tôi hiểu, đội bị phạm lỗi sẽ bị trừng phạt. Với những thay đổi quy tắc mới này, có những tình huống phải được sửa đổi. Pha phạm lỗi đáng nhận thẻ vàng, nhưng cuối cùng chúng tôi lại mất Messi trong hai phút\".\n" +
                    "\n"+
            "92\n" +
                    "Thể thaoBóng đáCác giải khácThứ hai, 13/5/2024, 09:04 (GMT+7)\n" +
                    "HLV Inter Miami muốn MLS đổi luật vì Messi\n" +
                    "MỸHLV Gerardo Martino muốn giải bóng đá Mỹ thay đổi, sau khi Lionel Messi phải đứng ngoài hai phút, không thể lập tức vào sân ở trận Inter Miami thắng ngược Montreal.\n" +
                    "\n" +
                    "Phút 40 trận đấu thuộc vòng 17, khi Inter Miami đang thua 0-2, Messi bị hậu vệ Montreal George Campbell phạm lỗi. Ngôi sao người Argentina phải rời sân để được chăm sóc y tế, còn Campbell bị thẻ vàng.\n" +
                    "\n" +
                    "Inter Miami được hưởng quả đá phạt với cự ly khoảng 25m, nhưng Messi không thể vào sân thực hiện vì luật \"Chăm sóc y tế ngoài sân\" của MLS. Tiền đạo 36 tuổi lắc đầu ngao ngán, quay về phía camera và nói \"Chúng ta đang làm một điều tồi tệ với loại quy tắc này\".\n" +
                    "\n" +
                    "Tiền đạo Lionel Messi được chăm sóc y tế sau pha phạm lỗi trong trận Inter Miami thắng Montreal 3-2 ở vòng 17 MLS 2024 ngày 12/5. Ảnh: AP\n" +
                    "\n" +
                    "Tiền đạo Lionel Messi được chăm sóc y tế sau pha phạm lỗi trong trận Inter Miami thắng Montreal 3-2 ở vòng 17 MLS 2024 ngày 12/5. Ảnh: AP\n" +
                    "\n" +
                    "Theo luật \"Chăm sóc y tế ngoài sân\" được áp dụng từ tháng 4, nếu cầu thủ chấn thương nằm trên sân quá 15 giây, trọng tài sẽ dừng trận đấu và yêu cầu đội ngũ y tế vào sân. Nếu có thể tiếp tục thi đấu, cầu thủ này sẽ phải rời sân và ở ngoài tối thiểu hai phút để được đánh giá và điều trị thêm. Điều này nhằm tránh tình trạng cầu thủ câu giờ.\n" +
                    "\n" +
                    "Quy tắc này cũng có những ngoại lệ, trong trường hợp chấn thương ở đầu, chấn thương của thủ môn, tình trạng y tế nghiêm trọng và phạm lỗi dẫn đến thẻ vàng hoặc đỏ. Trong trường hợp của Messi, nếu cầu thủ của Montreal nhận thẻ vàng, luật hai phút ngoài sân sẽ không có hiệu lực.\n" +
                    "\n" +
                    "Martino không hài lòng và muốn MLS sửa luật. \"Tình huống đó, Messi rõ ràng bị phạm lỗi. Cầu thủ đối phương đáng nhận thẻ vàng, điều đó có nghĩa là Messi sẽ không bao giờ rời sân trong hai phút\", ông nói thêm. \"Theo tôi hiểu, đội bị phạm lỗi sẽ bị trừng phạt. Với những thay đổi quy tắc mới này, có những tình huống phải được sửa đổi. Pha phạm lỗi đáng nhận thẻ vàng, nhưng cuối cùng chúng tôi lại mất Messi trong hai phút\".\n" +
                    "\n" +
                    "Inter Miami còn trải nghiệm một quy định mới khác của MLS ở phút bù thứ hai, khi Luis Suarez không thể rời sân dưới mười giây khi nhường chỗ cho Leo Campana. Việc Suarez rời sân chậm buộc trọng tài thứ tư hoãn việc thay người một phút, khiến Inter Miami chỉ còn 10 người cuối trận.\n" +
                    "\n" +
                    "Theo MLS, luật thay người có tính giờ quy định rằng \"việc không rời khỏi bất kỳ điểm nào trên sân trong vòng 10 giây sẽ khiến cầu thủ vào sân phải chờ thêm 60 giây. Trong thời gian này, CLB đó sẽ thi đấu thiếu một người. Các trường hợp ngoại lệ đối với quy tắc này bao gồm chấn thương và thay thế thủ môn\".\n" +
                    "\n" +
                    "Suarez đã phàn nàn với trọng tài thứ tư, nhưng Martino cho rằng tiền đạo Uruguay hiểu nhầm, chưa nắm rõ luật, tưởng mình có một phút để rời sân thay vì 10 giây.\n" +
                    "\n" +
                    "Trong tình huống đá phạt cuối hiệp một, do không có Messi, tiền vệ Matias Rojas sút phạt, đưa bóng xoáy qua hàng rào về góc gần, rút ngắn tỷ số xuống 1-2. Sau đó, hai cầu thủ Nam Mỹ khác là Suarez và Benjamin Cremaschi lần lượt ghi bàn giúp đội khách lội ngược dòng. Kết quả này giúp Inter Miami củng cố đỉnh bảng xếp hạng miền Đông MLS với 27 điểm qua 13 trận, hơn Cincinnati ba điểm. Ở trận tiếp theo sáng thứ Năm 16/5, giờ Hà Nội, Messi và đồng đội tiếp tục làm khách trên sân của Orlando City, trong trận derby bang Florida.",
            "MỸRose Zhang bị dẫn ba gậy sau 13 hố vòng cuối, nhưng vẫn vô địch Founders Cup 2024 ở điểm -24 với cách biệt hai gậy so với á quân Madelene Sagstrom.\n" +
                    "\n" +
                    "Founders Cup 2024 diễn ra trên sân par72 ở New Jersey, hạ màn sáng nay, 13/5, giờ Hà Nội. Kết quả ghi Zhang ấn định mốc thắng -24, Sagstrome về nhì ở mức -22, còn vị trí thứ ba mới -9.\n" +
                    "\n" +
                    "Đây là màn ngược dòng ấn tượng của Zhang khi cùng xuất phát lượt chót và cạnh tranh tay đôi với Sagstrome nhiều kinh nghiệm hơn trong chặng chốt thành tích.\n" +
                    "\n" +
                    "Lúc nhập cuộc, đàn chị người Thụy Điển dẫn ở điểm -19, còn Zhang ở mức -18. Ngay hố mở vòng, Zhang suýt ngã ngửa vì mất thăng bằng khi cố đưa bóng vào green. Cú đó đưa bóng trúng cán cờ, tạo điều kiện cho cô giữ par tầm gần. \"Lúc ấy, tôi thầm nghĩ chắc hôm nay mình sẽ may mắn\", Zhang về sau kể lại suy nghĩ lạc quan, dù suýt té khi vừa vào trận.\n" +
                    "\n" +
                    "Còn Sagstrome, sau bogey hố 1, tăng dần điểm giải, đến hố 13 đạt -23. Khi đó, Zhang mới -20.\n" +
                    "\n" +
                    "Nhưng từ hố 14, nữ golfer Mỹ sắp 21 tuổi bắt đầu rút ngắn cách biệt. Năm hố cuối, Zhang ghi bốn birdie trong khi Sagstrome có một bogey và không birdie. Với màn bứt phá đó, Zhang lập mốc thắng -24 cho Founders Cup 2024, lĩnh 450.000 USD, hơn Sagstrome gần 250.000 USD."+
            "Sagstrome năm nay 31 tuổi, vào LPGA Tour từ 2016, đến nay đã qua 152 giải trong đó vô địch Gainbridge LPGA hồi 2020 và về nhì major Women’s Open 2021. So với Sagstrome, Zhang còn non trận mạc.\n" +
                    "\n" +
                    "Zhang tuyên bố đấu golf chuyên nghiệp vào ngày 26/5/2023, sau sinh nhật hai ngày. Một tuần sau thông báo ấy, Zhang lần đầu đánh giải ở diện pro, lại ở đẳng cấp LPGA Tour, tại Mizuho Americas Open. Chung cuộc, cô ẵm cup và trở thành golfer đầu tiên lên ngôi vô địch khi chào sân LPGA Tour trong 72 năm, sau Beverly Hanson hồi 1951.\n" +
                    "\n" +
                    "Trước khi thành \"tour player\", Zhang liên tục đứng đầu bảng golf nữ nghiệp dư thế giới từ 2020 đến 2022 và lập kỷ lục tại vị 141 tuần. Hai năm qua, Zhang đã ký hợp đồng quảng bá cho nhiều thương hiệu lớn như Rolex (đồng hồ), Adidas (trang phục thi đấu), Callaway (gậy, bóng), Delta Airlines, gần đây nhất là thỏa thuận hợp tác nhiều năm với hãng viễn thông AT&T.\n" +
                    "\n" +
                    "Zhang chơi golf từ chín tuổi, có bố mẹ là người Trung Quốc định cư ở California. Cô đang theo Đại học Stanford, trường cũ của Tiger Woods. Lịch sử Stanford ghi nhận Zhang đoạt 12 cup, nhiều nhất trong tuyển golf của trường, tính cả đội nam và nữ qua các thời kỳ trong đó có Woods.",
            "Ông Nguyễn Hữu Minh đau lòng khi con trai qua đời, nhưng cũng cố gắng nghĩ rằng VĐV thể dục dụng cụ 18 tuổi này sẽ không còn phải chịu thêm đau đớn từ điều trị.\n" +
                    "\n" +
                    "Minh Triết qua đời sáng 9/5, sau bảy tháng điều trị chấn thương nặng gặp phải trong lúc tập luyện ở Trung tâm Huấn luyện Quốc gia I (Nhổn, Hà Nội). \"Sự ra đi của Triết là mất mát không thể bù đắp với gia đình\", ông Nguyễn Hữu Minh – bố Minh Triết – nói với VnExpress chiều 10/5. \"Tôi cầu mong con ra đi thanh thản, khép lại những đau đớn\".\n" +
                    "\n" +
                    "Tang lễ của Minh Triết sẽ diễn ra sáng nay tại Nhà tang lễ bệnh viện Thanh Nhàn. Anh sau đó được đưa đi hoả táng ở Nghĩa trang Văn Điển, Hà Nội."+
            "Minh Triết từng được đánh giá là VĐV tiềm năng. Các HLV nhận xét anh rất chịu khó, tích cực tập luyện, luôn mơ ước được noi gương các thế hệ đàn anh để có thể đóng góp cho Thể dục dụng cụ Việt Nam.\n" +
                    "\n" +
                    "Ngày 10/11/2023, trong một buổi tập của đội tuyển TDDC, Minh Triết thực hiện động tác lộn hai vòng sau, nhưng không may tiếp đất bằng đầu xuống hố mút dẫn đến chấn thương nặng ở vùng cổ. Anh được đưa đến bệnh viện E để phẫu thuật vấn đề ở đốt sống cổ C5, C6 gây chèn ép tuỷ. Đến ngày 28/11, tình hình chuyển biến xấu nên Triết được chuyển sang bệnh viện Bạch Mai phẫu thuật lần hai do có mảnh xương vỡ làm ảnh hưởng đến phổi.\n" +
                    "\n" +
                    "Do nằm một chỗ lâu nên Triết bị loét vùng cụt, cơ thể suy kiệt dẫn đến suy đa tạng, suy dinh dưỡng. Anh liên tục phải dùng kháng sinh liều cao, thở máy, truyền dinh dưỡng, vỗ rung phổi... Đến tháng 4/2024, anh chuyển viện lần hai sang Thanh Nhàn khi sự sống chỉ còn tính bằng ngày.\n" +
                    "\n" +
                    "Ông Minh qua ba bệnh viện, chứng kiến con ngày càng gầy mà đau lòng. Ông cho biết ban đầu Triết vẫn còn nói chuyện được nhưng sau chỉ còn biết gật và lắc, rồi bất động."+
            "Minh Triết sinh năm 2006 nhưng sớm là trụ cột của gia đình. Bố Minh đã nghỉ hưu và đang làm bảo vệ, còn mẹ bị ung thư. Nhà Triết có một chị gái sinh năm 2002, anh hai bị điện giật từ nhỏ mất khả năng lao động và em gái sáu tuổi. Tiền chữa trị cho Minh Triết một phần do bảo hiểm y tế chi trả, còn lại do Trung tâm Huấn luyện Thể thao Quốc gia Hà Nội, Trung tâm TDTT Quân đội và Liên đoàn Thể dục Việt Nam hỗ trợ.\n" +
                    "\n" +
                    "Liên đoàn cũng kêu gọi các nhà hảo tâm giúp gia đình Triết được hơn hai tỷ đồng. Từ số tiền ủng hộ này, ông Minh dành một khoản mua căn nhà nhỏ ở quận Hoàng Mai, giúp gia đình thoát cảnh thuê trọ trong căn phòng chưa đầy 20 mét vuông nhiều năm qua. \"Đến cuối cùng Triết vẫn là người lo cho cả gia đình\", ông Minh nói."+
            "Sau khi Triết mất, ông Hầu Trung Linh – HLV ở đội thể dục Quân đội và ĐTQG – nói đây là mất mát quá lớn của TDDC Việt Nam. Theo ông, việc đào tạo một VĐV TDDC là hành trình dài vất vả. Triết tập luyện từ bảy tuổi và sau 10 năm chuẩn bị bước vào các sân chơi lớn hơn thì gặp nạn.\n" +
                    "\n" +
                    "\"Chúng tôi mong Triết được an nghỉ sau thời gian dài chiến đấu\", ông Linh chia sẻ.\n" +
                    "\n" +
                    "Trên mạng xã hội, nhiều VĐV như chân chạy Nguyễn Thị Oanh, võ sĩ Nguyễn Thị Tâm, kình ngư Hoàng Quý Phước, VĐV đấu kiếm Phạm Thị Thu Hoài, VĐV bắn cung Lộc Thị Đào... đã gửi lời chia buồn đến gia đình và mong Triết yên nghỉ.\n" +
                    "\n" +
                    "Cục TDTT, Liên đoàn thể dục Việt Nam... sẽ tổ chức đoàn viếng và đưa VĐV vắn số về nơi an nghỉ cuối cùng.",
            "ĐĂK LĂKSang Thổ Nhĩ Kỳ thi đấu, nữ VĐV bóng chuyền Trần Thị Thanh Thuý muốn đưa hình ảnh bóng chuyền Việt Nam ra thế giới.\n" +
                    "\n" +
                    "Sau bốn năm thi đấu tại Nhật Bản ở CLB BlueCats, Thanh Thuý sẽ sang Thổ Nhĩ Kỳ đầu quân cho CLB hàng đầu Kuzeyboru. Theo chủ công người Bình Dương, cô nhận được rất nhiều lời mời nhưng chọn Thổ Nhĩ Kỳ vì ở đó có nền bóng chuyền phát triển, quy tụ nhiều ngôi sao thế giới.\n" +
                    "\n" +
                    "\"Tôi đã tìm hiểu rất kỹ mới quyết định sang Thổ Nhĩ Kỳ. Đó cũng là nguyện vọng của lãnh đạo CLB Bình Điền Long An\", Thanh Thuý chia sẻ trưa 11/5. \"Được thi đấu ở châu Âu, với hàng loạt ngôi sao hàng đầu là áp lực lớn với tôi. Bên cạnh đó tôi cũng rất hồi hộp và lo lắng khi va chạm, trải nghiệm ở môi trường chuyên môn cao. Với cơ hội hiếm có này, tôi sẽ cố gắng nhiều hơn và hy vọng chơi tốt để mang hình ảnh bóng chuyền Việt Nam ra thế giới và cũng như tạo tiền đề cho các VĐV bóng chuyền Việt Nam ra thế giới nhiều hơn\"."+
            "Hiện, chủ công 26 tuổi ở Việt Nam, khoác áo CLB Bình Điền Long An thi đấu tại giải bóng chuyền quốc tế VTV9-Cup Bình Điền 2024. Thanh Thuý vui mừng vì được trở lại quê nhà sau nhiều năm thi đấu ở nước ngoài. \"Tôi rất cảm động khi nhận được sự quan tâm rất lớn của người hâm mộ dù ít đấu ở Việt Nam. Vì thế, tôi sẽ cố gắng hết sức để cống hiến cho khán giả\", Thuý nói.\n" +
                    "\n" +
                    "Giải khai mạc tối nay tại thành phố Buôn Ma Thuột, Đăk Lăk khi Thanh Thuý đối đầu đội bóng cũ PFU BlueCats. Cô cảm thấy phấn khích và háo hức, đồng thời đánh giá cao đối thủ có đội hình gắn kết, ổn định, đồng đều công thủ, có ngoại binh mạnh Melissa Valdeds mới nhập tịch Nhật Bản."+
            "Giả VTV9-Bình Điền 2024 diễn ra tại Đăk Lăk từ ngày 11 đến 19/5 với tám đội. Trong đó có năm đội trong nước gồm: VTV Bình Điền Long An, LPBank Ninh Bình, Hóa chất Đức Giang Lào Cai, BCTT Trường Tươi Bình Phước, U20 Việt Nam và ba đội nước ngoài gồm Tứ Xuyên (Trung Quốc), PFU BlueCats (Nhật Bản), U20 Thái Lan. Giải đấu là cơ hội cho tuyển bóng chuyền Việt Nam và đội U20 Việt Nam chuẩn bị cho giải U20 châu Á.\n" +
                    "\n" +
                    "Tổng giải thưởng hơn một tỷ đồng, trong đó đội vô địch nhận 15.000 USD, á quân nhận 10.000 USD. Ngoài các giải tập thể, ban tổ chức cũng trao các giải cá nhân dành cho chủ công hay nhất, phụ công hay nhất, đối chuyền hay nhất, hoa khôi, vận động viên xuất sắc toàn diện, vận động viên áo dài đẹp nhất... mỗi giải 700 USD."
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
