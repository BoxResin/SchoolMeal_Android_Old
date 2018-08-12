package winapi251.app.schoolmeal.model.school

import winapi251.app.schoolmeal.model.Area

/** 가짜 학교 검색기 */
object FakeSchoolSearcher : SchoolSearcher
{
    override fun search(area: Area, schoolName: String): List<SchoolInfo>
    {
        val sample = listOf(
                SchoolInfo(code = "B100000925", courseCode = "2", kindCode = "02",
                        name = "서울선린초등학교", address = "서울특별시 강동구 둔촌2동",
                        area = Area.SEO_UL),

                SchoolInfo(code = "B100002350", courseCode = "3", kindCode = "03",
                        name = "선린중학교", address = "서울특별시 용산구 청파동3가",
                        area = Area.SEO_UL),

                SchoolInfo(code = "B100000658", courseCode = "4", kindCode = "04",
                        name = "선린인터넷고등학교", address = "서울특별시 용산구 청파동3가",
                        area = Area.SEO_UL)
        )
        return sample.filter { area == it.area && schoolName in it.name }
    }
}
