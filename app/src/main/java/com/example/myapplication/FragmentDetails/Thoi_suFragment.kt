package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.FragmentDetails.RecAadapter

class Thoi_suFragmentt : Fragment() {
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
            R.drawable.thuocla,
            R.drawable.chayxe,
            R.drawable.dancoi,
            R.drawable.tau,
            R.drawable.tramdungchan,
            R.drawable.muahn
        )

        names = arrayOf(
            "Thủ tướng yêu cầu tăng cường ngăn chặn thuốc lá điện tử",
            "Ôtô khách, xe container tông liên hoàn, một người chết",
            "Mất mạng vì nghịch đạn cối",
            "Giá vé tàu cao tốc TP HCM - Côn Đảo cao nhất 1,1 triệu đồng",
            "Mở thầu xây 8 trạm dừng nghỉ trên cao tốc Bắc Nam",
            "Nhiều tuyến phố ở Hà Nội ngập sau mưa lớn"
        )

        ingredients = arrayOf(
            "Thủ tướng Phạm Minh Chính yêu cầu các bộ ngành, địa phương áp dụng nhiều biện pháp tăng cường kiểm soát, ngăn chặn thuốc lá điện tử, nung nóng.\n" +
                    "\n" +
                    "Trong công điện tối 13/5, Thủ tướng đánh giá tỷ lệ hút thuốc lá điếu giảm trung bình 0,5% mỗi năm trong nam giới, song gần đây lại xuất hiện tràn lan thuốc lá điện tử, thuốc lá nung nóng. Loại mới này có xu hướng tăng nhanh, ảnh hưởng xấu đến sức khỏe người dùng.\n" +
                    "\n" +
                    "Trước thực trạng trên, Thủ tướng yêu cầu Bộ Y tế tăng cường truyền thông về tác hại thuốc lá điện tử, thuốc lá nung nóng; nghiên cứu, đề xuất giải pháp quản lý. Bộ Tài chính chỉ đạo Hải quan kiểm soát chặt việc vận chuyển thuốc lá điện tử qua cửa khẩu, xác lập chuyên án đấu tranh với các ổ nhóm buôn lậu.\n" +
                    "\n" +
                    "Bộ Quốc phòng, Công an được giao tăng cường tuần tra, kiểm soát ở khu vực biên giới và xác lập chuyên án điều tra, triệt phá các đầu nậu cung cấp thuốc lá điện tử để truy tố trước pháp luật. Trong khi đó, Bộ Công Thương cần quản lý thị trường nội địa, xử lý nghiêm các tổ chức, cá nhân buôn bán loại thuốc lá này.\n" +
                    "\n" +
                    "Tăng cường tuyên truyền tác hại là yêu cầu của Thủ tướng với Bộ Thông tin và Truyền thông, Giáo dục và Đào tạo, các cơ quan báo chí."+
            "Đầu tháng 4, tại phiên giải trình do Ủy ban Xã hội tổ chức về trách nhiệm quản lý nhà nước với thuốc lá điện tử, nung nóng, Bộ trưởng Y tế Đào Hồng Lan nhiều lần nhấn mạnh quan điểm \"Bộ Y tế vẫn đề xuất cấm\" và nhất quán từ trước đến nay với loại hình thuốc lá mới này. Thuốc lá điện tử, nung nóng rất nguy hiểm, ảnh hưởng đến sức khỏe người dân, thế hệ trẻ.\n" +
                    "\n" +
                    "Đại biểu Nguyễn Anh Trí (nguyên Viện trưởng Huyết học và Truyền máu Trung ương) cũng đồng tình quan điểm thuốc lá điện tử là \"chất gây nghiện, gây ung thư\". Tác hại thuốc lá điện tử đã được nhận biết trên toàn thế giới và mặt hàng này \"không có một chút ưu điểm nào\" để quản lý, sử dụng.\n" +
                    "\n" +
                    "Thuốc lá điện tử và nung nóng là sản phẩm thế hệ mới, vận hành bằng cách làm nóng dung dịch các chất chứa nicotine hoặc hương vị, thường hòa tan thành propylene glycol hoặc glycerine.\n" +
                    "\n" +
                    "Có ít nhất 60 hợp chất hóa học đã được tìm thấy trong dung dịch thuốc lá điện tử (còn gọi là tinh dầu) và nhiều hợp chất khác có trong khí/khói tạo ra. Loại này không có nguyên liệu thuốc lá mà chỉ sử dụng hương liệu, hóa chất nên không phải là thuốc lá theo định nghĩa của Luật Phòng chống tác hại thuốc lá và không thuộc phạm vi điều chỉnh.\n" +
                    "\n" +
                    "Theo kết quả điều tra của Tổ chức Y tế Thế giới (WHO), Bộ Y tế với học sinh tại 11 tỉnh, thành phố, tỷ lệ sử dụng thuốc lá điện tử trong học sinh liên tục tăng ở các nhóm tuổi. Loại thuốc này gây nghiện do có chứa nicotine; các bệnh ung thư, bệnh tim mạch, bệnh hô hấp và ảnh hưởng sức khỏe tâm thần. Thuốc lá điện tử còn có nguy cơ gây ra nhiều ảnh hưởng cấp tính như tổn thương phổi cấp, ngộ độc, thương tích do nổ pin, tăng nguy cơ sử dụng thuốc lá điếu thông thường, tăng nguy cơ sử dụng ma túy và các chất gây nghiện khác.",
            "Xe khách, ôtô container va chạm với hai xe khác trên đường ĐT 741, huyện Đồng Phú, gây ra hỏa hoạn, tài xế tử vong, 3 người bị thương nặng, trưa 13/5.\n" +
                    "\n" +
                    "Gần 11h, xe container 40 feet do ông Trần Quang Đạt (49 tuổi) điều khiển chạy trên đường ĐT 741 theo hướng Bình Phước về TP HCM. Khi đến ngã ba thuộc ấp Minh Hòa, xã Tân Tiến, ôtô bất ngờ va chạm với xe tải biển số Bình Dương và ôtô 5 chỗ chạy cùng chiều."+
            "Tai nạn khiến xe container và ôtô tải tông thẳng vào dải phân cách, đâm gãy trụ đèn, lao sang phía đường đối diện va chạm xe khách Phương Trang đang đi hướng ngược lại. Cả xe tải và ôtô khách hư hỏng nặng phần đầu. Các xe chắn ngang đường khiến giao thông qua khu vực ùn ứ.\n" +
                    "\n" +
                    "Anh Hùng, người dân ở gần hiện trường, cho biết sau sự cố, nhiều khách trên ôtô la hét, tìm cách thoát thân. \"Người dân hai bên đường hỗ trợ nạn nhân, kêu xe cấp cứu, một lát sau đầu ôtô container cháy ngùn ngụt\", anh Hùng kể."+
            "Ông Nguyễn Quang Tiến, lái xe cấp cứu Bệnh viện đa khoa tỉnh Bình Phước, cho biết khi đến hiện trường, tài xế và phụ xe ôtô tải bị chấn thương nặng. Cả hai được đưa vào Bệnh viện đa khoa tỉnh Bình Phước, song tài xế xe tải là Lê Nhựt Minh (29 tuổi, trú Bạc Liêu) tử vong.\n" +
                    "\n" +
                    "Đại diện hãng xe Phương Trang thông tin lúc tai nạn, ôtô khách chạy từ TP HCM lên Buôn Ma Thuột, trên ôtô ngoài tài xế và phụ xe còn có 23 khách. Va chạm liên hoàn khiến tài xế gãy tay và chân trái, bé gái 6 tuổi bị thương. Cả hai được cấp cứu ở Bệnh viện huyện Đồng Phú. Một số khách bị xây xát ngoài da, được người dân chăm sóc vết thương, không cần vào viện."+
            "\"Chúng tôi đã cử người đến hiện trường phối hợp lực lượng chức năng làm rõ nguyên nhân tai nạn, hỗ trợ khách\", đại diện nhà xe Phương Trang nói, cho biết những khách không bị thương được chuyển qua ôtô khác tiếp tục hành trình.\n" +
                    "\n" +
                    "Lực lượng cảnh sát PCCC Công an tỉnh Bình Phước đã điều ba xe chuyên dụng cùng hàng chục cán bộ, chiến sĩ đến hiện trường dập lửa, cứu người. Bước đầu lực lượng chức năng ghi nhận 4 xe đều hư hỏng, thiệt hại hơn 450 triệu đồng. CSGT phối hợp chính quyền phân luồng, giảm ùn tắc ở khu vực."+
            "Là tuyến huyết mạch nối Bình Dương và Bình Phước, ĐT 741 dài 198 km, rộng 33 m, thường xuyên đông xe. Tuyến có điểm đầu ở ngã tư Sở Sao (giao quốc lộ 13, tỉnh Bình Dương), điểm cuối giao tỉnh lộ 686 tại thôn 2, xã Quảng Trực, huyện Tuy Đức, tỉnh Đăk Nông. Tuyến đường giao với quốc lộ 14 tại ngã tư Đồng Xoài.",
            "Lượm được quả đạn cối, thay vì nộp cho nhà chức trách, anh Trần Đình Hoài ở huyện Vĩnh Linh lại ném xuống đường, gây nổ và tử vong.\n" +
                    "\n" +
                    "Khoảng 12h ngày 13/5, anh Trần Đình Hoài, 34 tuổi, trú xã Hiền Thành, huyện Vĩnh Linh, nhặt được quả đạn cối khi đi bắt cá trên cánh đồng."+
            "Anh Hoài mang quả đạn ném xuống mặt đường liên xã gần ngã ba Hiền Lương. Đạn phát nổ, mảnh vỡ găm vào người khiến anh bị thương và tử vong khi vào Bệnh viện Đa khoa tỉnh Quảng Trị.\n" +
                    "\n" +
                    "Tại hiện trường, nhiều vết máu loang lổ trên đường. Cá, ốc vương vãi khắp nơi. Công an huyện Vĩnh Linh đang phối hợp các đơn vị điều tra sự việc.\n" +
                    "\n" +
                    "Trong chiến tranh, Quảng Trị là một trong những chiến trường khốc liệt nhất cả nước. Người dân nơi đây đã gánh chịu hàng nghìn tấn bom do quân đội Mỹ ném xuống. Nhiều loại vũ khí, bom đạn vẫn còn sót lại trên vùng đất Quảng Trị.",
            "Tàu Thăng Long sức chứa hơn 1.000 người chạy tuyến TP HCM - Côn Đảo khai thác từ 13/5, giá vé 615.000 đồng đến 1,1 triệu đồng mỗi chặng.\n" +
                    "\n" +
                    "Đây là tàu cao tốc chở khách trên biển lớn nhất hiện nay ở Việt Nam với chiều dài hơn 77 m, rộng khoảng 9,5 m, sức chứa 1.017 khách, tốc độ 35 hải lý (hơn 60 km) mỗi giờ, thời gian từ TP HCM đến Côn Đảo khoảng 4 giờ. Tàu có thể chạy ở thời tiết gió giật cấp 8, giảm say sóng và an toàn cho hành khách."+
            "Theo Công ty cổ phần tàu cao tốc Phú Quốc Express (chủ đầu tư), mỗi tuần tàu chạy 3 chuyến, cách nhau một ngày. Trong đó, tại TP HCM tàu khởi hành lúc 7h ở cảng Hiệp Phước, huyện Nhà Bè, rồi theo luồng sông Soài Rạp - vịnh Đồng Tranh - Biển Đông đến Côn Đảo. Tại Côn Đảo, tàu sẽ xuất phát lúc 13h ở cảng Bến Đầm và trở lại TP HCM. Hiện, vé tàu đã được mở bán tại các đại lý, phòng vé và website thuộc hệ thống của công ty với mức giá 615.000 đồng - 1,1 triệu đồng mỗi người, tuỳ hạng vé, thời điểm xuất phát.\n" +
                    "\n" +
                    "Hiện giá vé máy bay tuyến TP HCM - Côn Đảo thấp nhất hơn 1,6 triệu đồng mỗi chặng, lúc cao điểm vé hai chiều gần 6 triệu đồng. Sau khi Bamboo Airways dừng bay Côn Đảo từ tháng 4/2024, chỉ còn Vietnam Airlines khai thác chặng này.\n" +
                    "\n" +
                    "Phó giám đốc Sở Giao thông Vận tải TP HCM Bùi Hoà An nói tàu cao tốc TP HCM - Côn Đảo là tuyến vận tải hành khách đường thuỷ lần đầu triển khai. Trước đó, người dân từ thành phố chỉ có thể theo đường hàng không, hoặc đến TP Vũng Tàu rồi đi tàu ra Côn Đảo. Vì vậy, khi đưa vào khai thác tuyến tàu cao tốc trên sẽ góp phần tăng kết nối vùng Đông Nam Bộ, giúp khách có thêm lựa chọn tới Côn Đảo - địa điểm du lịch lớn phía Nam.\n" +
                    "\n" +
                    "\"Ngoài đáp ứng nhu cầu đi lại, kích thích phát triển du lịch, việc khai thác tuyến tàu cao tốc này góp phần giảm tải và hỗ trợ khách bằng đường hàng không, đặc biệt là trong thời gian sân bay Côn Đảo thi công mở rộng\", ông An nói."+
            "Ngoài tuyến tàu nêu trên, tại TP HCM trước đó đã đưa vào khai thác tàu cao tốc từ khu trung tâm và phà biển từ Cần Giờ đi Vũng Tàu. Theo kế hoạch phát triển vận tải hành khách, du lịch đường thủy từ nay đến năm 2025, thành phố dự kiến đầu tư thêm hai tuyến ở nội đô, gồm: quận 1 đi quận 7, Nhà Bè và và tuyến từ bến Bạch Đằng đi Thanh Đa.\n" +
                    "\n" +
                    "Hai tuyến liên tỉnh khác cũng được lên kế hoạch đầu tư, gồm tuyến từ quận 1 đi Bình Dương, Củ Chi và phà biển từ Cần Giờ đi huyện Gò Công Đông, tỉnh Tiền Giang. Theo lãnh đạo Sở Giao thông Vận tải, việc mở rộng loại hình này ngoài mục tiêu giảm tải cho đường bộ còn nhằm phát triển du lịch, kinh tế giữa các địa phương trong vùng.",
            "Ngày 20/5, Bộ Giao thông Vận tải sẽ mở thầu lựa chọn nhà đầu tư xây 8 trạm dừng nghỉ trên cao tốc Bắc Nam, triển khai xây dựng đến cuối năm 2025.\n" +
                    "\n" +
                    "Để đồng bộ với tuyến cao tốc Bắc Nam dài 650 km đã đi vào hoạt động, Bộ Giao thông Vận tải phê duyệt 36 trạm dừng nghỉ. Đến nay 6 trạm đã đưa vào khai thác, 3 đang đầu tư và 27 chưa xây dựng. Trong đó, 24 trạm chưa xây dựng thuộc các dự án thành phần do Bộ Giao thông Vận tải quản lý.\n" +
                    "\n" +
                    "Đại diện Bộ Giao thông Vận tải cho biết trong số 24 trạm do Bộ quản lý, 8 trạm đã phát hành hồ sơ mời thầu và được mở thầu vào ngày 20/5, dự kiến lựa chọn xong trong tháng 6. Thời gian xây dựng theo hồ sơ mời thầu là 18 tháng, trong đó các công trình dịch vụ công cộng 12 tháng.\n" +
                    "\n" +
                    "8 trạm dừng nghỉ nằm trên các đoạn cao tốc Mai Sơn - quốc lộ 45, Nghi Sơn - Diễn Châu, Diễn Châu - Bãi Vọt, Nha Trang - Cam Lâm, Cam Lâm - Vĩnh Hảo, Vĩnh Hảo - Phan Thiết (2 trạm) và Phan Thiết - Dầu Giây."+
            "Đối với 13 trạm dừng nghỉ khác phần lớn nằm trên cao tốc Bắc Nam giai đoạn 2 (2021-2025), Bộ Giao thông Vận tải đang xây dựng thông tư hướng dẫn, dự kiến ban hành trong tháng 5. Việc lựa chọn nhà đầu tư sẽ tiến hành trong tháng 8, dự kiến hoàn thành cùng thời gian các dự án cao tốc Bắc Nam giai đoạn 2.\n" +
                    "\n" +
                    "Hiện còn 3 trạm được các bên liên quan thống nhất vị trí, rà soát phương án đầu tư hoặc bổ sung hạng mục trạm dừng nghỉ trong quyết định đầu tư dự án.\n" +
                    "\n" +
                    "Do ngân sách hạn chế, chưa thu hút được nhiều nguồn vốn xã hội hóa, dự án cao tốc Bắc Nam giai đoạn 1 (2017-2021) gồm 11 dự án thành phần và dự án cao tốc Bắc Nam giai đoạn 2 (2021-2025) gồm 12 dự án thành phần đều chưa bao gồm trạm dừng nghỉ, hệ thống camera, làn dừng khẩn cấp.\n" +
                    "\n" +
                    "Trong khi chờ xây trạm nghỉ theo quy hoạch, Bộ Giao thông Vận tải đã chỉ đạo các đơn vị dự án bố trí nhiều điểm dừng nghỉ tạm trên cao tốc Bắc Nam để phục vụ người dân. Ngoài ra, một số đường nhánh gần cao tốc đã có các điểm dừng nghỉ, lái xe được hướng dẫn đi ra nút giao để sử dụng dịch vụ.",
            "Trận mưa khoảng một giờ đã khiến nhiều tuyến phố nội thành Hà Nội ngập 30-50 cm, trong đó đại lộ Thăng Long nghiêm trọng nhất.\n" +
                    "\n" +
                    "Từ 19h, Hà Nội đổ mưa lớn. Lượng mưa đo được lớn nhất tại quận Ba Đình và Hai Bà Trưng hơn 70 mm, trong khi Đống Đa, Hoàn Kiếm đều trên 60 mm.\n" +
                    "\n" +
                    "Mưa lớn trong thời gian ngắn đã khiến một số tuyến phố ngập. Tại đại lộ Thăng Long đoạn qua Thiên Đường Bảo Sơn, xã An Khánh, huyện Hoài Đức, nước ngập cả hai bên hầm chui, giao thông gặp khó khăn."+
            "Anh Xuân Quang, lái xe dịch vụ, cho biết khi đến phần hầm phía làn đường gom thì không thể di chuyển. Bên làn cao tốc, dòng xe xếp thành hàng nối đuôi nhau đi ở làn ngoài, nơi ngập ít nhất nước cũng lên đến nửa bánh. Khi đi qua hầm, anh Quang đã cố đạp dứt khoát ga để xe không bị chết máy.\n" +
                    "\n" +
                    "Đường Châu Văn Liêm hướng ra đại lộ Thăng Long cũng ngập, đoạn sâu nhất khoảng 40 cm, nhiều xe chết máy."+
            "Đường Nguyễn Trãi đoạn dưới chân ga tàu điện vành đai 3 ngập kéo dài 500 m, phương tiện phải di chuyển chậm. Mưa lớn cũng gây tắc đường, đến 21h hàng dài phương tiện vẫn nối đuôi nhau qua đoạn ngập kéo dài hơn một km.\n" +
                    "\n" +
                    "Trên phố Nguyễn Tuân giáp đường Nguyễn Trãi, nước cũng ngập tới bánh ôtô. Đây là điểm đen ngập úng mấy năm gần đây do tuyến phố đang chuẩn bị cải tạo mở rộng nên hạ tầng thoát nước không đồng bộ."+
            "Theo Công ty Một thành viên thoát nước, Hà Nội đã xảy ra một số điểm úng ngập như 155 Phùng Hưng, Tông Đản, Liên Trì - Nguyễn Gia Thiều, Thụy Khuê, Cao Bá Quát, Ngã tư Phan Bội Châu - Lý Thường Kiệt, gầm chui xe lửa phố Thiên Đức.\n" +
                    "\n" +
                    "Tại thời điểm mưa, Công ty đã mở cửa các hồ điều hòa Thiền Quang, Bảy Mẫu, Đống Đa và vận hành hợp lý các trạm bơm đầu mối Yên Sở, Đồng Bông 1, Đồng Bông 2, Cổ Nhuế...; đồng thời ứng trực, thoát nước, vớt rác tại miệng thu trên toàn địa bàn quản lý."+
            "Trung tâm Dự báo Khí tượng Thủy văn quốc gia cho biết mưa lớn tại Hà Nội và miền Bắc do ảnh hưởng của rìa phía nam khối không khí lạnh ở Trung Quốc tràn xuống, cộng thêm tác động của vùng hội tụ gió trên độ cao 1.500-3.000 m.\n" +
                    "\n" +
                    "Trong đêm nay và ngày mai, miền Bắc dự báo tiếp tục mưa giông với lượng mưa phổ biến 20-40 mm, có nơi trên 90 mm."
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
