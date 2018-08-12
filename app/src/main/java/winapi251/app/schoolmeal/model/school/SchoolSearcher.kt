package winapi251.app.schoolmeal.model.school

/** 학교 검색기 */
interface SchoolSearcher
{
    /**
     * 학교를 검색한다.
     * @param schoolName 학교명
     * @return 검색된 학교 목록
     */
    fun search(schoolName: String): List<SchoolInfo>
}
