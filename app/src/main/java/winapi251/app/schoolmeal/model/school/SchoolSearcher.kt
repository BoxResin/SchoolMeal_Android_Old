package winapi251.app.schoolmeal.model.school

import winapi251.app.schoolmeal.model.Area

/** 학교 검색기 */
interface SchoolSearcher
{
    /**
     * 학교를 검색한다.
     * @param area       행정구역
     * @param schoolName 학교명
     * @return 검색된 학교 목록
     */
    fun search(area: Area, schoolName: String): List<SchoolInfo>

    // 디폴트 동작 설정
    companion object : SchoolSearcher by FakeSchoolSearcher
}
