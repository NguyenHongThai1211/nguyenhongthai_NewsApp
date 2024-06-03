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

class The_gioiFragment : Fragment() {
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
            R.drawable.chientranh,
            R.drawable.nga,
            R.drawable.bangdangnhat,
            R.drawable.voi,
            R.drawable.bienhieumy,
            R.drawable.biendong,
            R.drawable.tranhcu,
            R.drawable.dientapbiendong,
            R.drawable.duc
        )

        names = arrayOf(
            "Mũi tấn công của Nga phơi bày điểm yếu trên phòng tuyến Ukraine",
            "Israel đối mặt 'sóng thần ngoại giao' vì chiến sự Gaza",
            "Băng đảng 'bán thời gian' thế chân yakuza tại Nhật Bản",
            "Lào tặng cặp voi cho Campuchia",
            "Sống một năm trong biển hiệu siêu thị ở Mỹ",
            "Trung Quốc bị nghi xây thêm đảo nhân tạo ở Biển Đông",
            "Cơn gió ngược với ông Biden trên đường tái tranh cử",
            "Mỹ, Philippines diễn tập bắn chìm tàu trên Biển Đông",
            "Đức điều tra vụ mộ của cựu bộ trưởng bị quật"
        )

        ingredients = arrayOf(
            "Chiến dịch vượt biên giới tấn công vào Kharkov mà Nga phát động cho thấy Ukraine thiếu nhân lực và khí tài nghiêm trọng, cùng khả năng phòng không kém.\n" +
                    "\n" +
                    "Đối với Ukraine, tháng 5 ngày càng trở thành khoảng thời gian khốc liệt nhất.\n" +
                    "\n" +
                    "Thành phố Vovchansk ở tỉnh Kharkov mà lực lượng Ukraine tái kiểm soát hơn 18 tháng trước cuối tuần qua chứng kiến những cuộc pháo kích và không kích dữ dội của Nga. Lực lượng Nga sau đó bất ngờ mở chiến dịch tấn công dọc theo biên giới dài khoảng 100 km, nhằm chọc thủng phòng tuyến của Ukraine trong khu vực.\n" +
                    "\n" +
                    "Tổng thống Ukraine Volodymyr Zelensky cùng các quan chức Ukraine cho biết nỗ lực tiến quân của Nga vào Vovchansk bị chặn đứng, song lực lượng Nga đã cắt đứt nhiều tuyến đường tới thành phố.\n" +
                    "\n" +
                    "Trong khi đó, Bộ Quốc phòng Nga tuyên bố đã thọc sâu vào phòng tuyến Ukraine và kiểm soát 9 làng dọc biên giới Kharkov chỉ trong hai ngày tấn công, kết quả mà lực lượng nước này phải mất nhiều tháng mới đạt được tại mặt trận miền đông.\n" +
                    "\n" +
                    "Tổng tư lệnh quân đội Ukraine Oleksandr Syrsky thừa nhận lực lượng nước này đối mặt tình thế khó khăn ở Kharkov, song cho biết họ đang làm tất cả những gì có thể để giữ vững phòng tuyến."+
            "Giới quan sát cho rằng mũi tấn công bất ngờ ở Kharkov là một ví dụ nữa cho những thách thức mà Ukraine phải đối mặt khi bước sang năm thứ ba xung đột với Nga. Lực lượng Ukraine đang bị dàn mỏng, hỏa lực pháo binh bị Nga áp đảo, lưới phòng không suy yếu, trong khi nguồn binh sĩ tiếp viện thiếu thốn. Tình cảnh càng trở nên tồi tệ khi thời tiết chuẩn bị bước vào mùa hè, tạo điều kiện cho các đơn vị tăng thiết giáp Nga di chuyển dễ dàng hơn.\n" +
                    "\n" +
                    "Thiếu tướng Vadym Skibitsky, phó giám đốc Cơ quan Tình báo Quốc phòng Ukraine, tuần trước nói với Economist rằng vấn đề của lực lượng nước này là \"không có vũ khí\" và người Nga biết tháng 4-5 là thời điểm khó khăn với Ukraine.\n" +
                    "\n" +
                    "Tình báo Ukraine ước tính Nga hiện đã tập trung hơn nửa triệu quân ở Ukraine hoặc tại khu vực biên giới nước này. Skibitsky thêm rằng Moskva cũng bố trí \"lực lượng dự bị\" ở miền trung nước Nga, sẵn sàng chi viện cho các mũi tiến công thọc sâu.\n" +
                    "\n" +
                    "Cuộc tấn công ở biên giới đông bắc Ukraine diễn ra sau khi Nga thành lập cánh quân mới có tên Sever (Cánh quân Bắc). George Barros, thành viên tại Viện Nghiên cứu Chiến tranh ở Washington đánh giá Sever là \"nhóm tác chiến đáng kể\" của Nga.\n" +
                    "\n" +
                    "\"Nga đã tìm cách huy động 60.000-100.000 quân cho cánh quân này để tấn công Kharkov và chúng tôi đánh giá quân số hiện tại của họ là gần 50.000 người\", Barros nói, khẳng định lực lượng này \"có khả năng chiến đấu mạnh mẽ\".\n" +
                    "\n" +
                    "Một đơn vị đặc nhiệm của Ukraine cuối tuần trước cho hay đợt tấn công này \"chỉ là khởi đầu và Nga đã có vị thế mạnh mẽ để tiến hành thêm các mũi thọc sâu khác\".\n" +
                    "\n" +
                    "Dù vậy, đà tiến của Nga đã khiến một số chỉ huy Ukraine tại Kharkov bất ngờ và bức xúc với cách thức tổ chức, xây dựng phòng tuyến của giới chức địa phương.\n" +
                    "\n" +
                    "Chính quyền Kharkov từng tuyên bố đã đầu tư khoản tiền lớn xây dựng hệ thống phòng tuyến, chướng ngại vật dọc biên giới với Nga để ngăn đối phương tấn công. Tuy nhiên, Denys Yaroslavskyi, chỉ huy đơn vị trinh sát Ukraine tại Kharkov, cho hay phòng tuyến thứ nhất dọc biên giới \"đơn giản là không tồn tại\".\n" +
                    "\n" +
                    "\"Chẳng có phòng tuyến đầu tiên nào cả. Chúng tôi nhìn thấy lính Nga thản nhiên tiến vào, không có bãi mìn nào trên đường đối phương di chuyển\", Yaroslavskyi nói.\n" +
                    "\n" +
                    "Frontelligence Insight, nhóm phân tích tình báo Ukraine, tìm cách trấn an dư luận, khẳng định biên giới giữa Kharkov với Nga không phải là khu vực phù hợp để xây dựng phòng tuyến thứ nhất.\n" +
                    "\n" +
                    "\"Biên giới là vùng xám, nơi không có binh sĩ hay chiến hào, nên lực lượng Nga mới có thể tiến nhanh như vậy\", nhóm này cho hay. \"Thay vào đó, Ukraine xây dựng tuyến phòng thủ cách biên giới vài km, nơi quân đội và lực lượng phòng vệ lãnh thổ đang trấn giữ cũng như ngăn chặn lực lượng Nga\".\n" +
                    "\n" +
                    "Frontelligence Insight bác thông tin \"phòng tuyến Ukraine đang sụp đổ\", thêm rằng lực lượng Nga tấn công không phải những đơn vị thiết giáp quy mô lớn, mà là các đơn vị chiến thuật nhỏ.\n" +
                    "\n" +
                    "Dù vậy, một số nhà phân tích cảnh báo Nga có thể tung lực lượng dự bị mở rộng tấn công biên giới về phía tây tới khu vực Sumy, nơi đã chứng kiến các đợt đột kích của lực lượng đặc nhiệm Nga trong nhiều tháng qua.\n" +
                    "\n" +
                    "Cánh quân Sever không đủ lực lượng để tấn công và kiểm soát một thành phố lớn như Kharkov, song đó dường như không phải mục tiêu của Nga. Barros nói rằng mục tiêu của họ là buộc Ukraine phải điều quân từ Donetsk tới Kharkov, khiến Kiev phải dàn mỏng lực lượng dọc tiền tuyến gần 1.000 km. Điều này được cho là sẽ tạo ra cơ hội, đặc biệt ở tỉnh Donetsk, để Nga đạt được những mục tiêu chính trong năm 2024.\n" +
                    "\n" +
                    "Chiến dịch ở Kharkov cũng có thể kéo lực lượng Ukraine khỏi tuyến phòng thủ Kupiansk ở tỉnh Kharkov, nơi các mũi tiến công của Nga đã đình trệ trong nhiều tháng. Nỗ lực này nhằm tạo ra vùng đệm bên trong lãnh thổ Ukraine để ngăn chặn các đòn tập kích của Kiev vào thành phố biên giới Belgorod của Nga."+
            "Ukraine không chỉ đối mặt thách thức ở Kharkov. Quân đội Ukraine tuần trước thừa nhận họ phải chứng kiến số vụ giao tranh gia tăng với hơn 150 trận chỉ trong ngày 9/5, sau đợt tăng đáng kể vào tháng 3-4.\n" +
                    "\n" +
                    "Nga thực tế có đủ nhân lực để dàn mỏng tuyến phòng thủ của Ukraine tại nhiều điểm nóng cách nhau hàng trăm km, buộc Kiev phải dự đoán xem đối phương sẽ tiến hành cuộc tấn công lớn mùa hè vào địa điểm và thời điểm nào.\n" +
                    "\n" +
                    "Tần suất tấn công gia tăng của Nga đã phơi bày hai lỗ hổng nghiêm trọng của Ukraine, gồm thiếu nhân lực và lực lượng phòng không mỏng. Nga đã nhanh chóng khai thác cả hai, tận dụng khoảng thời gian trước khi đợt vũ khí viện trợ mới của phương Tây chuyển đến Ukraine đủ mang lại tác động trong vài tuần tới.\n" +
                    "\n" +
                    "\"Nhân lực vẫn là thách thức cốt lõi và Ukraine đang nỗ lực khôi phục các lữ đoàn đã bị suy giảm sức chiến đấu sau nhiều tháng giao tranh, đồng thời thành lập 10 lữ đoàn cơ động mới\", Barros nói.\n" +
                    "\n" +
                    "Các nhà phân tích phương Tây tin rằng Nga có thể áp đảo lực lượng Ukraine với tỷ lệ 10:1 ở Chasov Yar, thành trì tại tỉnh Donetsk. Ukraine cũng thua kém về số lượng đạn pháo và thiếu lực lượng yểm trợ trên không. Một blogger quân sự Ukraine tuần trước ước tính có tới 15 lữ đoàn bộ binh Nga, với tổng quân số 15.000 quân, đang hoạt động theo hướng Chasov Yar.\n" +
                    "\n" +
                    "Tướng Skibitsky thừa nhận Chasov Yar rơi vào tay Nga là kịch bản có thể xảy ra, thêm rằng \"tất nhiên không phải ngay hôm nay hay ngày mai, mà tất cả phụ thuộc vào nguồn dự trữ và nguồn cung bổ sung của chúng tôi\".\n" +
                    "\n" +
                    "Stanislav, lính Ukraine chiến đấu ở đông bắc Chasov Yar, tuần trước cho biết lực lượng đông đảo của Nga chia thành nhiều nhóm \"đang tấn công cả ngày lẫn đêm\", khiến phía phòng thủ kiệt sức.\n" +
                    "\n" +
                    "\"Nga cũng đang tận dụng ưu thế trên không để tập kích Kharkov bằng bom lượn thả từ chiến đấu cơ, do Ukraine không có hệ thống phòng không đủ sức đối phó. Điều này cho thấy nhu cầu cấp thiết là Mỹ cần chuyển thêm khí tài phòng không tầm xa để Ukraine có thể đánh chặn chúng\", Barros nói.\n" +
                    "\n" +
                    "Mỹ ngày 10/5 thông báo gói viện trợ đạn phòng không và vũ khí khác trị giá 400 triệu USD cho Ukraine, song giới quan sát cho rằng Kiev cần nhiều hơn nữa.\n" +
                    "\n" +
                    "Tổng thống Ukraine cho biết \"chúng tôi có thể ngăn chặn quân Nga ở miền đông\" cho tới khi viện trợ đến, song thừa nhận tình hình ở mặt trận này thực sự khó khăn và số vũ khí được chuyển đến Ukraine \"hiện chưa phải là tất cả số đã được thông qua\".\n" +
                    "\n" +
                    "\"Chúng tôi cần mọi thứ tới nhanh hơn\", ông nói thêm."+
            "Mỗi ngày viện trợ phương Tây chưa đến nơi, người Nga sẽ có thêm cơ hội tiến quân và Ukraine khó có thể bảo tồn nguồn nhân lực quý giá, theo giới quan sát. Barros nói những bước tiến mà Nga đạt được gần đây ở Kharkov không chỉ mang tính cơ hội, mà họ đã chuẩn bị rất kỹ để khai thác nó.\n" +
                    "\n" +
                    "\"Ukraine có thể cần phải đưa ra những quyết định đầy khó khăn trong tình thế tiến thoái lưỡng nan hiện tại\", chuyên gia này nói, thêm rằng điều đó đồng nghĩa Kiev nhiều khả năng phải chấp nhận mất thêm lãnh thổ để có thêm thời gian, dù nhiều phần trong số đó sẽ rất khó giành lại.",
            "Những hành động của chính quyền Thủ tướng Netanyahu ở Gaza đã làm dấy lên làn sóng phẫn nộ quốc tế và gây ra \"cơn sóng thần ngoại giao\".\n" +
                    "\n" +
                    "Đại sứ Israel Gilad Erdan ngày 10/5 đã có những phát biểu vô cùng giận dữ trước khi Đại hội đồng Liên Hợp Quốc (LHQ) bỏ phiếu về triển vọng kết nạp Palestine trở thành thành viên đầy đủ của tổ chức. Đứng trên bục phát biểu, ông cầm theo bản sao Hiến chương LHQ và thả chúng vào máy hủy tài liệu cầm tay, thể hiện sự phản đối của Israel với cuộc bỏ phiếu.\n" +
                    "\n" +
                    "\"Tự tay các ngài đang xé bỏ Hiến chương LHQ. Đó là điều các ngài đang làm đấy\", ông Erdan nói."+
            "Nhưng điều đó không ngăn được Đại hội đồng thông qua nghị quyết, với 143 phiếu thuận, 9 phiếu chống và 25 phiếu trắng, nêu rằng Palestine nên được trao tư cách thành viên LHQ và khuyến nghị Hội đồng Bảo an xem xét vấn đề này.\n" +
                    "\n" +
                    "Dù đây chỉ là nghị quyết mang tính biểu tượng, bởi Mỹ, thành viên thường trực Hội đồng Bảo an, nhiều khả năng sẽ phủ quyết để thể hiện sự ủng hộ với đồng minh Israel. Tuy nhiên, đây là một trong những diễn biến cho thấy Israel đang ngày càng bị cô lập về mặt ngoại giao trên trường quốc tế, theo giới quan sát.\n" +
                    "\n" +
                    "Hồi đầu tháng 4, thời điểm đánh dấu 6 tháng xung đột ở Gaza nổ ra, truyền thông quốc tế đã tập trung sự chú ý vào tình trạng bị cô lập này của Israel.\n" +
                    "\n" +
                    "Guardian đăng bài về Israel với tựa đề \"Bị cô lập ở nước ngoài, bị chia rẽ trong nước\". Hãng AP đưa tin \"Sau 6 tháng chiến tranh, sự cô lập của Israel ngày càng tăng\". Reuters cũng lên bài tương tự với tiêu đề \"6 tháng sau cuộc chiến ở Gaza, Israel phải đối mặt với sự cô lập ngày càng sâu sắc\".\n" +
                    "\n" +
                    "Các nhà phân tích cho rằng Israel đang thực sự phải đối mặt \"cơn sóng thần ngoại giao\" vì cuộc chiến chống Hamas ở Dải Gaza. Nam Phi cuối năm ngoái kiện Israel lên Tòa Công lý Quốc tế (ICJ), cáo buộc Tel Aviv diệt chủng người Palestine ở Dải Gaza. Hội đồng Bảo an LHQ cuối tháng 3 thông qua nghị quyết yêu cầu ngừng bắn ở Gaza và Mỹ đã bỏ phiếu trắng.\n" +
                    "\n" +
                    "Với lá phiếu trắng này, Mỹ, đồng minh kiêm bên bảo trợ lớn nhất của Israel, đã thể hiện mong muốn mạnh mẽ rằng Israel sẽ thay đổi hướng đi trong xung đột ở Gaza. Washington cũng trừng phạt một số người định cư Israel ở Bờ Tây, đưa ra những tuyên bố giận dữ, đặc biệt liên quan tới tình hình nhân đạo ở Gaza và cuộc tập kích của Israel vào nhân viên đoàn cứu trợ quốc tế.\n" +
                    "\n" +
                    "Nghị viện châu Âu và nhiều quốc gia khác cũng bỏ phiếu kêu gọi Israel thay đổi cách tiếp cận trong cuộc chiến chống Hamas."+
            "Peter Beaumont, nhà bình luận của Guardian, cho rằng \"hành động của chính quyền Thủ tướng Benjamin Netanyahu đã làm dấy lên sự phẫn nộ của cộng đồng quốc tế và khiến cơn sóng thần ngoại giao được cảnh báo từ lâu trở thành hiện thực\".\n" +
                    "\n" +
                    "Chính quyền Tổng thống Mỹ Joe Biden đã đe dọa ngừng cấp vũ khí cho Israel và xác nhận dừng một lô bom chuyển tới cho đồng minh để phản đối chiến dịch nhằm vào Rafah, thành phố miền nam Gaza có hơn một triệu người Palestine đang trú ẩn. Ireland và Tây Ban Nha trong khi đó cam kết chính thức công nhận tư cách nhà nước của Palestine.\n" +
                    "\n" +
                    "Áp lực cũng gia tăng ở châu Âu về lệnh cấm nhập khẩu những sản phẩm của người định cư Israel. Thủ tướng Bỉ Alexander de Coo, quốc gia giữ chức chủ tịch luân phiên của Hội đồng Liên minh châu Âu, cho biết ông đang tìm kiếm đồng minh trong nỗ lực thúc đẩy lệnh cấm này, cho rằng Tel Aviv có khả năng vi phạm các điều khoản về nhân quyền trong thỏa thuận hợp tác EU - Israel.\n" +
                    "\n" +
                    "Thổ Nhĩ Kỳ, quốc gia từ lâu có quan hệ phức tạp với Israel, công bố lệnh cấm thương mại hoàn toàn với Tel Aviv.\n" +
                    "\n" +
                    "Tại khu vực Nam Mỹ, Tel Aviv cũng chứng kiến loạt quốc gia cắt hoặc hạ cấp quan hệ ngoại giao, trong đó Colombia trở thành quốc gia Nam Mỹ thứ hai sau Bolivia cắt hoàn toàn quan hệ với Israel.\n" +
                    "\n" +
                    "Cộng đồng quốc tế từng ủng hộ mạnh mẽ Israel sau vụ tấn công của Hamas ngày 7/10/2023, nhưng cách tiến hành chiến dịch ở Gaza của Tel Aviv cùng tình trạng bạo lực chống lại người Palestine ở Bờ Tây đã nhanh chóng làm dấy lên làn sóng thất vọng và phẫn nộ với Thủ tướng Netanyahu. Lãnh đạo Israel đã nhiều lần bác bỏ bất kỳ ý tưởng nào về việc công nhận nhà nước Palestine như đề xuất của Mỹ và nhiều nước.\n" +
                    "\n" +
                    "Chính phủ Israel tuyên bố tiếp tục chiến dịch vào thành phố Rafah, bất chấp cảnh báo từ nhiều bên, trong đó có Ngoại trưởng Mỹ Antony Blinken hồi tháng 3 nói rằng Tel Aviv có nguy cơ bị cô lập hơn nữa trên toàn cầu nếu làm như vậy.\n" +
                    "\n" +
                    "\"Những gì xảy ra trong vài tháng qua là sự tích tụ của nhiều thứ trong nhiều năm. Các chuyên gia đã nhiều lần cảnh báo về nguy cơ xảy ra xung đột, nhấn mạnh sự bất ổn trong tình hình giữa Israel và người Palestine\", Yossi Mekelberg, thành viên viện Chatham House ở Anh, nói.\n" +
                    "\n" +
                    "Mekelberg cho rằng làn sóng phẫn nộ của Mỹ và châu Âu gần đây với Israel là \"chưa từng có\", khi Tel Aviv sử dụng các loại bom đạn do Washington cung cấp để tấn công hàng loạt mục tiêu dân thường gây thương vong lớn."+
            "Dahlia Scheindlin, nhà bình luận của Haaretz, nhận định lệnh cấm thương mại của Thổ Nhĩ Kỳ và động thái trì hoãn giao vũ khí, đe dọa ngừng cung cấp thêm của Mỹ là những \"đòn giáng mạnh\" đối với Israel.\n" +
                    "\n" +
                    "Thương mại giữa Israel và Thổ Nhĩ Kỳ đã tăng lên mức 9 tỷ USD mỗi năm. Xuất khẩu và lao động của Thổ Nhĩ Kỳ rất quan trọng đối với ngành công nghiệp xây dựng của Israel. Ankara cũng là bên xuất khẩu nhiều nguyên liệu thô cần thiết và nhiều mặt hàng thực phẩm, nông sản, dệt may... cho Tel Aviv.\n" +
                    "\n" +
                    "Mỹ trong khi đó là nước viện trợ hàng đầu của Israel. Tính đến năm ngoái, Mỹ đã cung cấp 158,7 tỷ USD, trong đó khoảng 124,3 tỷ USD cho quân đội và hệ thống phòng thủ tên lửa của Tel Aviv, theo Cơ quan Nghiên cứu Quốc hội. Theo bản ghi nhớ 10 năm mà cựu tổng thống Barack Obama ký, Washington hiện cung cấp 3,8 tỷ USD viện trợ quân sự mỗi năm cho Israel, chưa kể đến khoản hỗ trợ 15 tỷ USD bổ sung mà Mỹ thông qua tháng trước.\n" +
                    "\n" +
                    "Shalom Lipner, cố vấn lâu năm của nhiều đời thủ tướng Israel, cảnh báo nếu chính phủ Israel phớt lờ lời cảnh báo từ nhà hỗ trợ quân sự và ngoại giao lớn nhất, điều đó sẽ gây \"bất lợi chiến lược\" cho Tel Aviv.\n" +
                    "\n" +
                    "Nhà bình luận Scheindlin cũng tin rằng nỗi thất vọng quốc tế đối với Israel đã được tích tụ từ lâu và chiến sự Gaza là giọt nước làm tràn ly. \"Israel đã hành xử thiếu cân nhắc, vụng về như kiểu tự lấy đá ghè chân mình\", bà nói.",
            "Khi chứng kiến ba người đeo mặt nạ xông vào cửa hàng đồng hồ tại quận thượng lưu Ginza, nhiều người ngỡ là cảnh quay phim hành động.\n" +
                    "\n" +
                    "Vụ trộm xảy ra vào tháng 5/2023 do nhóm ba thanh thiếu niên 16-19 tuổi gây ra, sau khi nhận phi vụ được đăng tuyển dụng trên mạng. Ba nghi phạm lấy 74 chiếc đồng hồ trị giá gần 2 triệu USD rồi lên xe tẩu thoát. Cả ba cùng tài xế bị bắt trong một giờ, cảnh sát đã thu hồi số đồng hồ bị trộm.\n" +
                    "\n" +
                    "Sự việc này không phải do yakuza, những băng đảng xã hội đen lâu đời, khét tiếng ở Nhật Bản, gây ra. Đây là hiện tượng tội phạm mới gọi là tokuryu, đang phát triển mạnh vào thời điểm ảnh hưởng của yakuza ngày càng mờ nhạt sau nhiều năm bị giới chức trấn áp."+
            "Tên gọi tokuryu kết hợp từ tokumei (ẩn danh) và ryudo (linh hoạt), chỉ các nhóm được lập ra để phạm tội, trong đó các thành viên thường không quen biết nhau, cũng như không biết kẻ đứng sau điều phối hoạt động.\n" +
                    "\n" +
                    "Yakuza hoạt động giống như mafia của phương Tây, với các quy định, thứ bậc trong tổ chức nghiêm ngặt và dấu hiệu dễ nhận biết là hình xăm trên cơ thể. Tokuryu ít phân cấp và tổ chức lỏng lẻo hơn yakuza, nhưng họ không ngần ngại thực hiện các vụ từ cướp, lừa đảo, cho đến hành hung, tống tiền, giết người, hầu hết được tuyển dụng qua những quảng cáo trực tuyến gọi là yami baito.\n" +
                    "\n" +
                    "Theo Yuji Yoshikawa, cựu điều tra viên của sở cảnh sát Tokyo về tội phạm ma túy và vị thành niên, yami baito là những quảng cáo công việc bán thời gian thường có những cụm từ như \"thu nhập cao\", \"kiếm tiền nhanh\", thậm chí có thể ứng trước khoản lương vài triệu yen.\n" +
                    "\n" +
                    "Quảng cáo tuyển dụng thường mơ hồ, không nhắc đến các hoạt động trái phép, chỉ nhấn mạnh vào mức lương thưởng cao theo ngày và trả bằng tiền mặt. Tuy nhiên, khi có người nộp đơn ứng tuyển, họ sẽ bị yêu cầu tham gia vào hoạt động tội phạm như làm nhân viên chuyển phát tiền có được từ một vụ lừa đảo, thực hiện một vụ cướp, hành hung, hay lừa đảo qua điện thoại.\n" +
                    "\n" +
                    "Những người bị thu hút bởi yami baito chủ yếu là trẻ tuổi, thất nghiệp hay đang gặp khó khăn về tài chính. Tuy nhiên, cũng có nhiều người nhận lời đơn giản là vì muốn có tiền để tiêu thoải mái. Một số khai bản thân và gia đình bị đe dọa, khiến họ phải tuân thủ mệnh lệnh. Ba nghi phạm trẻ tuổi và tài xế thực hiện vụ cướp ở Ginza trước đó không có tiền án.\n" +
                    "\n" +
                    "Sự xuất hiện của những công việc bán thời gian đen tối, lôi kéo những người trẻ tuổi vào các hoạt động bất hợp pháp, đã xóa mờ ranh giới giữa thế giới ngầm và những người dân bình thường.\n" +
                    "\n" +
                    "\"Đằng sau những thanh niên này không phải là yakuza mà là một đường dây lừa đảo, trong đó có những kẻ là thành viên tội phạm có tổ chức ở khu vực Kanto, cũng có những người bình thường sập bẫy tuyển dụng và trở thành 'gangster bán thời gian'\", một quan chức cảnh sát Tokyo nói.\n" +
                    "\n" +
                    "Từ tháng 9/2021 đến tháng 2/2023, cảnh sát đã bắt hơn 10.000 người bị cáo buộc là tội phạm tokuryu. Trong thời gian này, số vụ cướp táo tợn giữa ban ngày tại các khu phố sầm uất tăng cao chưa từng có.\n" +
                    "\n" +
                    "Hồi tháng 4, cảnh sát phát hiện hai thi thể cháy đen dưới lòng sông thị trấn Nasu, tỉnh Tochigi, được cho là một cặp vợ chồng bị sát hại. 6 nghi phạm đã bị bắt. Cảnh sát đã gặp nhiều thách thức trong nỗ lực xác định kẻ chủ mưu, bởi các nghi phạm được thuê thực hiện tội ác không quen biết nhau, không biết danh tính người điều phối."+
            "Phạm vi hoạt động của tokuryu rất rộng. Nhiều vụ trộm thời gian qua được cho là do nhóm người Nhật ở Philippines giật dây, sử dụng các ứng dụng nhắn tin điều phối. Nhóm này cũng bị cáo buộc thực hiện lừa đảo qua điện thoại, tống tiền doanh nhân Nhật Bản làm việc tại Manila.\n" +
                    "\n" +
                    "Cảnh sát Nhật gần đây bắt \"Luffy\", một trong những ông trùm của nhóm này, lấy biệt danh theo nhân vật anime nổi tiếng. Hơn 30 thành viên khác cũng bị dẫn độ về nước, trong đó có các cựu yakuza.\n" +
                    "\n" +
                    "Theo cảnh sát, các nhóm tokuryu có thể đã liên minh và chia sẻ lợi nhuận với các băng đảng truyền thống. Các tổ chức tokuryu cũng bị phát hiện hoạt động tại Thái Lan, Campuchia, những nơi yakuza được biết đến là có \"chân rết\".\n" +
                    "\n" +
                    "Sau thời gian giới chức liên tục trấn áp yakuza, số thành viên yakuza đã giảm xuống còn 20.400 vào năm 2023 từ mức đỉnh 180.000 người trong những năm 1960.\n" +
                    "\n" +
                    "Thế hệ yakuza lớn tuổi cảm thấy khó cám dỗ thanh niên bằng những hứa hẹn kiếm tiền dễ dàng. Luật cũng trở nên nghiêm ngặt hơn, khi các thành viên yakuza bị cấm mở tài khoản ngân hàng, đăng ký thẻ tín dụng, bảo hiểm, sim điện thoại. Các doanh nghiệp từng dính líu với băng đảng cũng chịu nhiều hạn chế."+
            "Tuy nhiên, các biện pháp trấn áp yakuza không được áp dụng với tokuryu. Noboru Hirosue, chuyên gia tội phạm học từ Đại học Ryukoku, nhận xét tội phạm tokuryu đã lợi dụng kẽ hở này để trỗi dậy trong khi yakuza bị trấn áp.\n" +
                    "\n" +
                    "\"Khi xã hội và tội phạm chuyển mình liên tục, các biện pháp phòng chống tội phạm đang gặp khó khăn để theo kịp\", ông Hirosue nhận định, cho biết trong tokuryu có nhiều cựu yakuza không thể kiếm sống hợp pháp do luật chống tội phạm, nhưng còn có cả nhân viên văn phòng, sinh viên.\n" +
                    "\n" +
                    "\"Điều này rất kỳ lạ. Nhiều người có dấu hiệu là thành viên các nhóm tội phạm lại là người bình thường, người trẻ tuổi\", ông nói. Theo NPA, hầu hết các trường hợp dính líu tội phạm là do bạn bè, đồng nghiệp, người quen trên mạng xã hội giới thiệu.\n" +
                    "\n" +
                    "Nhằm trấn áp tokuryu, Cơ quan Cảnh sát Quốc gia (NPA) hồi tháng 4 lập đơn vị gồm 500 điều tra viên giàu kinh nghiệm, bao trùm 7 tỉnh thường xuyên xảy ra cướp, lừa đảo gồm Tokyo, Saitama, Chiba, Kanagawa, Aichi, Osaka và Fukuoka.\n" +
                    "\n" +
                    "Yasuhiro Tsuyuki, lãnh đạo đơn vị, xác định thách thức là giải quyết tội phạm xuyên khu vực, phá bỏ rào cản giữa lực lượng cảnh sát các tỉnh.\n" +
                    "\n" +
                    "Nhưng nỗ lực tìm những kẻ đầu sỏ đang gặp nhiều thách thức do công nghệ, các thành viên sử dụng số điện thoại và điện thoại dùng một lần để liên lạc. \"Trong hầu hết các trường hợp, kẻ đầu sỏ không bao giờ bị bắt, chỉ những người trực tiếp hành động mới bị bắt\", ông Hirosue nói.",
            "Lào gửi tặng Quốc vương Campuchia cặp voi 4 tuổi, được chở bằng xe tải vượt hành trình 2.000 km để ủng hộ chương trình bảo tồn động vật của nước này.\n" +
                    "\n" +
                    "Chính phủ Lào ngày 12/5 bàn giao cho Trung tâm Giải cứu Động vật Hoang dã Phnom Tamao của Campuchia hai con voi Rumduol và Champa. Đây là món quà tặng Quốc vương Norodom Sihamoni, được thông báo khi Chủ tịch nước Lào Thongloun Sisoulith thăm chính thức Campuchia hồi tháng 4.\n" +
                    "\n" +
                    "Cặp voi một đực một cái này cùng sinh vào năm 2020 tại tỉnh Xaigna-bouli, được chuyển đến Campuchia bằng xe tải, vượt qua hành trình hơn 2.000 km. Bộ trưởng Nông nghiệp Campuchia Dith Tina ca ngợi món quà này là biểu tượng cho mong muốn tăng cường hợp tác giữa hai nước trong bảo tồn động vật hoang dã và nông nghiệp.\n" +
                    "\n" +
                    "\"Hình tượng loài voi từng được khắc trên những bức tường của Angkor Wat, Bayon và nhiều ngôi đền khác. Người Khmer cổ đại từng dùng voi làm phương tiện vận chuyển, đi lại và chinh chiến. Loài voi giờ đây đang bị đe dọa và cần được chúng ta bảo vệ\", ông Tina phát biểu tại lễ trao tặng."+
            "Bộ Nông nghiệp Campuchia đã xây dựng một khu chuồng đặc biệt cho Rumduol và Champa tại Phnom Tamao, có diện tích khoảng 1.500 m2 và chiều cao 1,3 m. Khu chuồng có chỗ ngủ, khoảnh đất vui chơi và ao tắm cho voi. Hai quản tượng Lào sẽ hỗ trợ trung tâm chăm sóc cặp voi trong 6 tháng tới.\n" +
                    "\n" +
                    "Campuchia từ năm 2020 đã triển khai kế hoạch hành động 10 năm nhằm bảo tồn loài voi tại nước này. Bộ Nông nghiệp Campuchia cho biết nước này còn khoảng 400-600 cá thể voi hoang dã và 75 cá thể được thuần hóa. Trung tâm Giải cứu Động vật Hoang dã Phnom Tamao đang nuôi 4 con voi, độ tuổi 18-35.",
            "Người phụ nữ 34 tuổi sống trong biển hiệu trên nóc một siêu thị ở bang Michigan suốt một năm trước khi bị phát hiện.\n" +
                    "\n" +
                    "\"Cô ấy là người vô gia cư\", sĩ quan Brennon Warren, sở cảnh sát Midland, bang Michigan, ngày 8/5 cho hay. \"Có người sống trong một tấm biển, đúng là chuyện khiến người ta không ngờ\".\n" +
                    "\n" +
                    "Ông cho hay người phụ nữ 34 tuổi, sống trong tấm biển của siêu thị Family Fare ở Midland được một năm. Cô bị phát hiện ngày 23/4. Siêu thị nằm trong khu bán lẻ, biển hiệu rộng 1,5 m, cao 2,4 m, có cửa và có thể đi vào từ mái nhà.\n" +
                    "\n" +
                    "\"Ván được trải lên làm sàn. Bên trong kê một chiếc bàn nhỏ, quần áo, máy pha cà phê, máy in và máy tính\", Warren mô tả. Người phụ nữ lấy điện từ ổ cắm trên mái nhà. \"Tôi không rõ làm thế nào mà cô ấy lên được đó. Cô ấy cũng không nói\"."+
            "Adrienne Chance , đại diện của SpartanNash, công ty mẹ của Family Fare, cho hay đối mặt với tình huống này, nhân viên cửa hàng đã cư xử \"với lòng nhân ái và sự chuyên nghiệp nhất\".\n" +
                    "\n" +
                    "Theo Warren, người phụ nữ tỏ thái độ hợp tác và đồng ý rời đi nhanh chóng. Cô không bị khởi tố.\n" +
                    "\n" +
                    "\"Chúng tôi đã cung cấp cho cô ấy một số thông tin về dịch vụ nhà ở trong khu vực\", ông nói. \"Tôi không rõ cô ấy đi đâu\".\n" +
                    "\n" +
                    "Saralyn Temple, giám đốc của Open Door, một tổ chức phi lợi nhuận hỗ trợ thực phẩm và chỗ ở, cho hay Midland, nơi có dân số 42.000 người, cần thêm nhà ở cho người có thu nhập thấp.\n" +
                    "\n" +
                    "\"Từ góc độ một người thường xuyên làm việc với người vô gia cư, tôi cho rằng cô ấy có tài xoay xở\", Temple nói. \"Chúng ta không muốn người ta phải hành động phi pháp để có nơi ở. Có nhiều lựa chọn tốt hơn\".",
            "Philippines thông báo phát hiện tàu Trung Quốc có dấu hiệu bồi đắp, xây đảo nhân tạo ở bãi cạn Sabina trên Biển Đông, nên điều tàu giám sát.\n" +
                    "\n" +
                    "Người phát ngôn Cảnh sát Biển Philippines (PCG) Jay Tarriela ngày 13/5 thông báo lực lượng này sẽ duy trì hiện diện thường xuyên gần bãi cạn Sabina để đảm bảo Trung Quốc không thể tiến hành các hoạt động bồi đắp, xây đảo nhân tạo nào tại đây.\n" +
                    "\n" +
                    "Sabina là thực thể nằm trong vùng đặc quyền kinh tế 200 hải lý của Philippines, nhưng Trung Quốc coi đây là thực thể thuộc yêu sách chủ quyền đối với Nam Sa, tên gọi mà Bắc Kinh sử dụng để chỉ quần đảo Trường Sa trên Biển Đông."+
            "Ông Tarriela cuối tuần trước cho hay PCG đã triển khai tàu BRP Teresa Magbanua đến bãi cạn Sabina từ ngày 15/4, sau khi giới chức nước này phát hiện nhiều đống san hô bị nghiền nát được đổ lên bãi cạn, dấu hiệu cho thấy Trung Quốc đang tìm cách bồi đắp thực thể này.\n" +
                    "\n" +
                    "PCG phát hiện 34 tàu dân quân biển của Trung Quốc cũng xuất hiện trong khu vực, được hộ tống bởi tàu hải quân, trực thăng và 4 tàu hải cảnh.\n" +
                    "\n" +
                    "Ông nói Philippines sẽ không \"nhún nhường\" và \"tiếp tục thực thi hiệu quả\" tuyên bố chủ quyền của Manila đối với bãi cạn bằng cách luân phiên triển khai tàu duy trì hiện diện tại đây.\n" +
                    "\n" +
                    "Francel Margareth Padilla, người phát ngôn quân đội Philippines, hôm nay cho biết các hoạt động bồi đắp đảo nhân tạo ở Sabina \"đã bị ngăn chặn\" sau hoạt động giám sát của PCG. Padilla cho hay tàu Trung Quốc hiện diện gần Sabina trong 26 ngày liên tục.\n" +
                    "\n" +
                    "\"Mọi hoạt động cải tạo đảo ở bãi cạn đã chấm dứt. Dù PCG vẫn phát hiện thợ lặn ở khu vực này, chúng tôi đã ngăn chặn hoạt động cải tạo đảo quy mô lớn\", bà Padilla nói.\n" +
                    "\n" +
                    "Tàu BRP Teresa Magbanua, dài hơn 96 m, là tàu tuần tra lớn nhất trong biên chế PCG. Con tàu được Nhật chuyển giao cho Philippines năm 2022, trong khuôn khổ thỏa thuận tăng cường năng lực an toàn hàng hải giữa hai nước."+
            "Tarriela nhận định việc Trung Quốc triển khai dân quân biển, hải cảnh, tàu nghiên cứu và hải quân đến gần bờ biển Palawan là diễn biến \"gây lo ngại, đe dọa chủ quyền và gây thiệt hại đáng kể đối với môi trường biển\" Philippines.\n" +
                    "\n" +
                    "Giới chức Trung Quốc chưa bình luận về tuyên bố của quân đội và cảnh sát biển Philippines.\n" +
                    "\n" +
                    "Trong vài tháng qua, Philippines đã nhiều lần cáo buộc tàu hải cảnh Trung Quốc áp sát nguy hiểm hoặc phun vòi rồng vào tàu PCG hoạt động trên Biển Đông.\n" +
                    "\n" +
                    "Các vụ chạm trán liên tục giữa lực lượng chấp pháp biển hai nước đang khiến khu vực và quốc tế lo ngại căng thẳng leo thang mất kiểm soát và dẫn đến hậu quả nguy hiểm.\n" +
                    "\n" +
                    "Trung Quốc từ năm 2011 đã bồi đắp trái phép 7 thực thể thuộc quần đảo Trường Sa của Việt Nam thành đảo nhân tạo và tiến hành các hoạt động quân sự hóa.\n" +
                    "\n" +
                    "Việt Nam nhiều lần khẳng định có đầy đủ bằng chứng lịch sử và cơ sở pháp lý để khẳng định chủ quyền đối với quần đảo Hoàng Sa và Trường Sa, phù hợp luật pháp quốc tế. Việt Nam kiên quyết phản đối các hành vi vi phạm chủ quyền với hai quần đảo Hoàng Sa và Trường Sa.",
            "Môi trường chính trị hiện nay với Tổng thống Biden được đánh giá là cực kỳ phức tạp, có thể là trận gió ngược cản trở nỗ lực tái tranh cử của ông.\n" +
                    "\n" +
                    "Những \"cơn gió ngược\" mà Tổng thống Joe Biden đối mặt đang nổi lên cả ở trong và ngoài nước, thường khiến cử tri nghi ngờ về việc liệu họ có nên giữ ông lại Nhà Trắng hay không.\n" +
                    "\n" +
                    "Ông đang phải đối mặt với các cuộc xung đột ở Trung Đông và Ukraine, với những diễn biến phức tạp, khó lường, liên tục đặt ra thách thức với uy tín của ông trên tư cách một lãnh đạo toàn cầu."+
            "Ở trong nước, Tổng thống Biden bị bao vây bởi các cuộc biểu tình tại loạt đại học phản đối chiến dịch quân sự của Israel ở Gaza, cũng như phong trào phản kháng từ một số cử tri trẻ cấp tiến, vốn là nền tảng cử tri rất quan trọng đối với ông.\n" +
                    "\n" +
                    "Thực tế cho thấy niềm tin trong công chúng Mỹ đối với Tổng thống đang bị lung lay hơn bao giờ hết. Người dân phải gánh chịu mức thuế suất cao và chi phí sinh hoạt tăng vọt, khiến lời trấn an của ông rằng nền kinh tế đang ở trạng thái tốt khó được chấp nhận, đồng thời làm lu mờ những thành tựu về lập pháp mà ông đạt được trong ba năm qua.\n" +
                    "\n" +
                    "Nếu tái đắc cử, Tổng thống Biden sẽ kết thúc nhiệm kỳ hai khi ông 86 tuổi. Danh xưng \"tổng thống lớn tuổi nhất trong lịch sử\" rõ ràng không phải một lợi thế với ông trên đường tranh cử.\n" +
                    "\n" +
                    "Tuy nhiên, tia sáng le lói với Tổng thống Biden là cựu tổng thống Donald Trump, đối thủ của ông trong cuộc đua Nhà Trắng, thậm chí còn phải chịu nhiều thách thức hơn.\n" +
                    "\n" +
                    "Trump đã dành cả tuần qua ở tòa án Manhattan để nghe lời khai về bê bối tình ái giữa ông với sao phim người lớn Stormy Daniels vào năm 2006, trong phiên tòa xét xử cáo buộc cựu tổng thống làm giả hồ sơ kinh doanh để chi tiền bịt miệng nữ diễn viên này.\n" +
                    "\n" +
                    "Trump cũng có xu hướng xa lánh các cử tri chủ chốt ở ngoại ô, những người có khả năng quyết định ai sẽ giành thắng lợi cuối cùng vào tháng 11. Những cảnh báo gần đây của Trump về việc không chấp nhận kết quả bầu cử năm 2024 nếu ông thua cuộc đang làm sống lại những ký ức đen tối về cuộc bạo loạn Đồi Capitol tháng 1/2021.\n" +
                    "\n" +
                    "Các cử tri ủng hộ Trump trung thành không để tâm đến các phiên tòa hình sự đang bủa vây ông, nhưng cuộc bầu cử giữa kỳ và bầu cử tổng thống gần đây nhất cho thấy ông thực sự khiến một bộ phận lớn cử tri sợ hãi, theo giới quan sát.\n" +
                    "\n" +
                    "Tuy nhiên, các cuộc thăm dò luôn cho thấy cử tri Mỹ quan tâm nhất đến nền kinh tế và xếp hạng của Tổng thống Biden về vấn đề này đang ở mức thấp. Một cuộc thăm dò do CNN thực hiện vào tháng 4 cho thấy chỉ 34% người tham gia ủng hộ ông về vấn đề kinh tế và chỉ 29% về lạm phát.\n" +
                    "\n" +
                    "Trong nhóm cử tri nói rằng nền kinh tế rất quan trọng đối với lá phiếu của họ, 66% ủng hộ cựu tổng thống Trump, trong khi tỷ lệ này với Tổng thống Biden chỉ là 30%, dù trong ba năm nhiệm kỳ của ông, kinh tế Mỹ tăng trưởng vững và số lượng việc làm mới được tạo ra đều đặn.\n" +
                    "\n" +
                    "Người Mỹ có xu hướng không chú ý đến các chỉ số vĩ mô, trong khi lạm phát đã tạo ra một thời kỳ lãi suất quá cao, tạo ra gánh nặng khủng khiếp lên người mua nhà, đẩy giá cả hàng hóa hàng ngày tăng mạnh, từ đó xóa tan mọi kết quả tích cực của ông trong mắt cử tri.\n" +
                    "\n" +
                    "Trong cuộc phỏng vấn với CNN tuần qua, Tổng thống Biden đã bác bỏ quan điểm cho rằng nền kinh tế đang trong tình trạng tồi tệ, đồng thời chia sẻ nỗi đau của người dân trước tình cảnh vật giá tăng cao.\n" +
                    "\n" +
                    "Dù vậy, ông vẫn bảo vệ nỗ lực của mình, nhắc tới việc một số tổng thống Mỹ trước đây đã thất vọng như thế nào khi cử tri không đánh giá cao cố gắng của họ.\n" +
                    "\n" +
                    "Khi được người dẫn chương trình Erin Burnett hỏi khi nào ông sẽ khôi phục niềm tin của người tiêu dùng, Tổng thống Biden khẳng định chính quyền \"đã xoay chuyển tình thế rồi\"."+
            "\"Khi tôi bắt đầu dẫn dắt chính quyền này, mọi người đã nói rằng nền kinh tế sẽ sụp đổ. Nhưng giờ chúng ta đang có nền kinh tế mạnh nhất thế giới. Hãy để tôi nói lại lần nữa, mạnh nhất thế giới!\", Tổng thống quả quyết.\n" +
                    "\n" +
                    "Nhưng nói với cử tri những điều tuyệt vời khi họ không cảm thấy như vậy là một chiến lược chính trị gây hoài nghi, nhà phân tích Stephen Collinson từ CNN nhận định. Theo ông, bất cứ khi nào một tổng thống cho thấy họ không nắm bắt được thực tế cuộc sống của cử tri, họ sẽ rơi vào tình thế nguy hiểm.\n" +
                    "\n" +
                    "Năm 1992, khi tổng thống George H.W. Bush đang tái tranh cử, ông được hỏi trong một cuộc tranh luận rằng \"làm thế nào ngài có thể tìm ra giải pháp cho các vấn đề kinh tế của người dân nếu không biết về những gì đang khiến họ kiệt quệ?\". Bush đã có một khởi đầu tồi tệ khi nhìn đồng hồ, khiến ông có vẻ như muốn né tránh vấn đề.\n" +
                    "\n" +
                    "Sau đó, ông đưa ra một câu trả lời ấp úng và khó hiểu: \"Tất nhiên là bạn cảm thấy điều đó khi bạn là tổng thống Mỹ và đó là lý do tôi đang cố gắng làm điều gì đó để giải quyết vấn đề đó\".\n" +
                    "\n" +
                    "Đối thủ của ông, Bill Clinton, đã đứng lên và cho khán giả cả nước thấy khả năng \"cảm nhận nỗi đau\" của ông. Clinton trực tiếp trả lời người hỏi, nói rằng với tư cách thống đốc bang Arkansas, ông biết nhiều người bị mất việc làm và tuyên bố sẽ khắc phục tình hình.\n" +
                    "\n" +
                    "Vài tháng sau, Clinton bước chân vào Nhà Trắng.\n" +
                    "\n" +
                    "Tổng thống Biden có nhiều thời gian hơn để thuyết phục cử tri rằng thời kỳ kinh tế tốt hơn đang ở phía trước và ông sẽ được giúp đỡ đáng kể nếu Cục Dự trữ Liên bang bắt đầu giảm lãi suất vào mùa hè này.\n" +
                    "\n" +
                    "Ông đã so sánh xuất thân bình dân của mình với lối sống kiểu tỷ phú của Trump trong những tuần gần đây, cố gắng xóa tan ý tưởng rằng cựu tổng thống quan tâm đến tầng lớp lao động Mỹ hơn ông, đồng thời cảnh báo người tiền nhiệm sẽ phá bỏ Đạo luật Chăm sóc Giá cả phải chăng nếu trở lại Nhà Trắng.\n" +
                    "\n" +
                    "\"Tôi xem xét vấn đề với góc nhìn khiêm tốn từ Scranton\", Tổng thống Biden nói, đề cập đến quê nhà của ông ở bang Pennsylvania. \"Trump nhìn mọi thứ từ dinh thự Mar-a-Lago. Ông ấy muốn cắt giảm thuế nhiều hơn cho giới siêu giàu\".\n" +
                    "\n" +
                    "Và Tổng thống Biden phần nào được hưởng lợi từ việc ông phải đối mặt với một đối thủ có những khoản nợ khổng lồ, chứ không phải một ngôi sao trẻ đang lên với tài năng kể câu chuyện kinh tế của tầng lớp trung lưu như cựu tổng thống Clinton, Collinson cho hay.\n" +
                    "\n" +
                    "Dù vậy, con đường với ông Biden không vì thế mà \"trải đầy hoa hồng\". Tổng thống hiện mắc kẹt trong cuộc đối đầu với Thủ tướng Israel, một đồng minh lâu năm, và cuộc xung đột gây nhức nhối ở Dải Gaza. Cuộc khủng hoảng có thể tạo động lực đáng kể cho tuyên bố từ cựu tổng thống Trump rằng nước Mỹ cũng như cả thế giới đang mất kiểm soát và cần một người mạnh mẽ hơn để khắc phục tình hình.\n" +
                    "\n" +
                    "Rạn nứt với Thủ tướng Benjamin Netanyahu xảy ra sau khi Tổng thống Biden cảnh báo rằng ông sẽ dừng chuyển một số vũ khí cho Israel nếu nước này tiến hành chiến dịch tấn công quy mô vào thành phố Rafah ở Gaza."+
            "Biden đã phải chịu áp lực rất lớn từ các nhà hoạt động cấp tiến, những người ủng hộ ông tại quốc hội và nhóm cử tri Mỹ gốc Arab tại các bang chiến trường quan trọng kêu gọi ông kiềm chế Thủ tướng Netanyahu.\n" +
                    "\n" +
                    "Trong khi đó, các cuộc biểu tình phản đối chiến sự ở loạt đại học lại khiến Tổng thống phải đứng giữa những cử tri trẻ tiến bộ, những người tức giận với lập trường ủng hộ Israel tấn công Gaza của ông, và nhóm ôn hòa, những người có thể dễ bị lay động vì tình trạng hỗn loạn mà phong trào biểu tình phản chiến gây ra.\n" +
                    "\n" +
                    "Không rõ liệu những đòn công kích quyết liệt của Đảng Cộng hòa nhằm vào Tổng thống Biden về vấn đề Israel sẽ khiến ông bị tổn thương đến mức nào. Nhưng nó rõ ràng đã củng cố quan điểm rộng rãi của đảng Cộng hòa rằng ông yếu đuối và không có khả năng ổn định một thế giới ngày càng bất ổn.\n" +
                    "\n" +
                    "Biden đã cố gắng tự bảo vệ mình khỏi tác động chính trị của phong trào biểu tình phản chiến bằng cách lập luận rằng dù quyền biểu tình được bảo đảm theo hiến pháp, bất kỳ thiệt hại tài sản nào từ việc sinh viên chiếm giữ các tòa nhà trong khuôn viên đại học đều không thể chấp nhận được.\n" +
                    "\n" +
                    "Trong bài phát biểu tại quốc hội tưởng nhớ các nạn nhân Holocaust hồi đầu tuần, ông đã lên án những biểu hiện của chủ nghĩa bài Do Thái tại một số cuộc biểu tình của sinh viên. Tổng thống cảnh báo rằng có quá nhiều người \"phủ nhận, hạ thấp, hợp lý hóa và phớt lờ mức độ khủng khiếp của Holocaust và sự kiện ngày 7/10\", đề cập đến cuộc đột kích của Hamas vào lãnh thổ Israel hồi năm ngoái.\n" +
                    "\n" +
                    "Các cuộc thăm dò cho thấy xung đột Israel - Hamas chỉ nằm ở vị trí rất thấp trong danh sách những vấn đề được cử tri Mỹ quan tâm. Song trong một cuộc bầu cử mà chỉ vài nghìn phiếu bầu ở một số bang quan trọng cũng có thể định đoạt kết quả cuối cùng, khả năng các cử tri Dân chủ giận dữ \"quay lưng\" hoặc không đi bầu cũng là một tín hiệu đáng báo động đối với Tổng thống Biden, Collinson nhấn mạnh.",
            "Quân đội Mỹ, Philippines phối hợp khai hỏa tên lửa, đạn pháo bắn chìm tàu dầu đã loại biên của Manila trong cuộc diễn tập trên Biển Đông.\n" +
                    "\n" +
                    "BRP Lake Caliraya, tàu chở dầu cỡ nhỏ đã bị hải quân Philippines loại biên, chìm xuống nước sau khi bị tấn công bởi loạt tên lửa diệt hạm, rocket và đạn pháo ở khu vực ngoài khơi thành phố Laoag của Philippines ngày 8/5, trong khuôn khổ cuộc tập trận chung thường niên Balikatan, giới chức Manila và Washington cho biết.\n" +
                    "\n" +
                    "Cuộc diễn tập đánh chìm tàu được tiến hành bởi một tàu tấn công nhanh, một hộ vệ hạm, một tiêm kích không quân, trực thăng và pháo binh mặt đất của quân đội Philippines, cùng một tiêm kích F-16 và phi cơ AC-130 của lực lượng Mỹ, nhằm mô phỏng tình huống tiêu diệt tàu địch.\n" +
                    "\n" +
                    "Video chia sẻ trên mạng xã hội cho thấy tàu BRP Lake Caliraya bốc khói sau khi liên tiếp trúng đạn, nghiêng dần về phía đuôi rồi từ từ chìm xuống biển."+
            "Trong diễn tập, các bên tham gia có \"nhiệm vụ ngăn chặn đối phương đổ bộ lên lãnh thổ Philippines\", trung tá Omar Al Assaf, người lên kế hoạch cho hoạt động diễn tập ngày 8/5 bên phía Philippines, cho biết.\n" +
                    "\n" +
                    "Trung tá Matt Cahill, chỉ huy đơn vị lục quân Mỹ tham gia diễn tập, khẳng định lục quân, không quân hai nước đã chứng tỏ khả năng phối hợp hiệu quả thông qua việc đánh chìm tàu BRP Lake Caliraya.\n" +
                    "\n" +
                    "Tàu BRP Lake Caliraya được chế tạo tại nhà máy Taizhou Zhongxing của Trung Quốc, ban đầu thuộc sở hữu của Tập đoàn Dầu khí Quốc gia Philippines (PNOC), trước khi được tặng lại cho hải quân nước này vào năm 2014. Tàu có trọng tải toàn phần 4.570 tấn, bị hải quân Philippines loại biên vào tháng 12/2020 sau khi phát hiện nhiều lỗi kỹ thuật khó sửa chữa.\n" +
                    "\n" +
                    "Giới chức Philippines khẳng định việc lực lượng này chọn tàu do Trung Quốc sản xuất làm mục tiêu phá hủy khi diễn tập không nhằm gửi đi thông điệp nào.\n" +
                    "\n" +
                    "\"Con tàu đã được sử dụng ở Philippines một thời gian dài, nên bất kỳ liên hệ nào với con tàu này, nếu có, đều không phải vấn đề\", tư lệnh hải quân Philippines Toribio Adaci khẳng định."+
            "Hơn 16.700 binh sĩ Philippines và Mỹ đang tham gia cuộc tập trận thường niên Balikatan, nghĩa là \"vai kề vai\" theo tiếng Tagalog bản địa. Sự kiện diễn ra từ ngày 22/4 đến 10/5 tại nhiều địa điểm khác nhau ở quốc gia Đông Nam Á.\n" +
                    "\n" +
                    "Trong khuôn khổ cuộc tập trận, các đơn vị quân đội Philippines và Mỹ sáng 6/5 đã diễn tập bắn đạn thật pháo binh và tên lửa ở khu vực duyên hải phía tây bắc đảo Luzon, mô phỏng kịch bản ngăn chặn lực lượng đối phương đổ bộ trên Biển Đông.\n" +
                    "\n" +
                    "Sự kiện diễn ra trong bối cảnh căng thẳng giữa Philippines và Trung Quốc gần đây gia tăng sau những vụ chạm trán giữa tàu chấp pháp của hai nước ở vùng biển.\n" +
                    "\n" +
                    "Phát ngôn viên Bộ Ngoại giao Trung Quốc Lâm Kiếm ngày 6/5 cảnh báo \"bất kỳ cuộc tập trận nào cũng không được nhắm vào hoặc gây tổn hại tới lợi ích của bên thứ ba\", khi được yêu cầu bình luận về Balikatan 2024.\n" +
                    "\n" +
                    "\"Các quốc gia trong khu vực có thể thấy rõ ai đang kích động đối đầu quân sự và làm leo thang căng thẳng trong khu vực\", ông Lâm nói.",
            "Cảnh sát Đức mở điều tra sau khi phát hiện có người đào hố tại mộ của cựu bộ trưởng tài chính Wolfgang Schaeuble, người qua đời hồi năm ngoái.\n" +
                    "\n" +
                    "\"Có chiếc hố hình phễu sâu 1,2 m tại mộ của bộ trưởng Schaeuble\", cảnh sát Đức cho biết ngày 13/5, thêm rằng kẻ đào mộ chưa chạm tới quan tài.\n" +
                    "\n" +
                    "Sự việc xảy ra tại nơi an nghỉ của cựu bộ trưởng tài chính Wolfgang Schaeuble ở quê nhà Offenburg, tây nam nước Đức. Cảnh sát Đức đang điều tra thêm.\n" +
                    "\n" +
                    "Các quan chức và chính trị gia Đức bày tỏ tức giận trước sự việc. Bộ trưởng Nội vụ Nancy Faeser gọi đây là \"tội ác đê hèn phải bị truy tố thẳng tay\". Chủ tịch Hạ viện Đức Baerbel Bas cho biết bà bị sốc trước hành vi xâm phạm nơi an nghỉ của người tiền nhiệm.\n" +
                    "\n" +
                    "Tổng thư ký đảng Liên minh Dân chủ Cơ đốc giáo (CDU) Carsten Linnemann gọi đây là \"hành động đáng ghê tởm\". \"Tôi hy vọng thủ phạm nhanh chóng bị bắt\", ông nói."+
                    "Ông Schaeuble, chính trị gia nổi bật trong chính trường Đức nhiều thập kỷ, qua đời ở tuổi 82 và được chôn cất tại quê nhà hồi tháng 1. Ông là thành viên của CDU, từng giữ chức bộ trưởng dưới thời hai cựu thủ tướng Helmut Kohl và Angela Merkel.\n" +
                    "\n" +
                    "Ông Schaeuble đóng vai trò quan trọng trong việc thống nhất nước Đức năm 1990 và được biết đến là người phụ trách chính sách \"thắt lưng buộc bụng\" (tăng thuế, giảm chi tiêu chính phủ) khi làm bộ trưởng tài chính dưới thời bà Merkel. Ông sau đó giữ chức chủ tịch Hạ viện Đức từ năm 2017 tới 2021 và vẫn là thành viên quốc hội cho tới khi qua đời.\n" +
                    "\n"
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
