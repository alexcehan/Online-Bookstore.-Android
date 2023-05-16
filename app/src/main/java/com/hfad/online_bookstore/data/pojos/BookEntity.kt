package com.hfad.online_bookstore.data.pojos

data class BookEntity(
    val _version_: Long,
    val already_read_count: Int,
    val author_alternative_name: List<String>,
    val author_facet: List<String>,
    val author_key: List<String>,
    val author_name: List<String>,
    val contributor: List<String>,
    val cover_edition_key: String,
    val cover_i: Int,
    val currently_reading_count: Int,
    val ddc: List<String>,
    val ddc_sort: String,
    val ebook_access: String,
    val ebook_count_i: Int,
    val edition_count: Int,
    val edition_key: List<String>,
    val first_publish_year: Int?,
    val first_sentence: List<String>,
    val has_fulltext: Boolean,
    val ia: List<String>,
    val ia_box_id: List<String>,
    val ia_collection: List<String>,
    val ia_collection_s: String,
    val ia_loaded_id: List<String>,
    val id_amazon: List<String>,
    val id_better_world_books: List<String>,
    val id_goodreads: List<String>,
    val id_librarything: List<String>,
    val isbn: List<String>?,
    val key: String,
    val language: List<String>,
    val last_modified_i: Int,
    val lcc: List<String>,
    val lcc_sort: String,
    val lccn: List<String>,
    val lending_edition_s: String,
    val lending_identifier_s: String,
    val number_of_pages_median: Int,
    val oclc: List<String>,
    val person: List<String>,
    val person_facet: List<String>,
    val person_key: List<String>,
    val place: List<String>,
    val place_facet: List<String>,
    val place_key: List<String>,
    var price: Double?,
    val printdisabled_s: String,
    val public_scan_b: Boolean,
    val publish_date: List<String>,
    val publish_place: List<String>,
    var publish_year: List<Int>,
    val publisher: List<String>,
    val publisher_facet: List<String>,
    var ratings_average: Double?,
    val ratings_count: Int,
    val ratings_count_1: Int,
    val ratings_count_2: Int,
    val ratings_count_3: Int,
    val ratings_count_4: Int,
    val ratings_count_5: Int,
    val ratings_sortable: Double,
    val readinglog_count: Int,
    val seed: List<String>,
    val subject: List<String>,
    val subject_facet: List<String>,
    val subject_key: List<String>,
    val subtitle: String,
    val time: List<String>,
    val time_facet: List<String>,
    val time_key: List<String>,
    val title: String,
    val title_sort: String,
    val title_suggest: String,
    val type: String,
    val want_to_read_count: Int
): java.io.Serializable {
    override fun hashCode(): Int {
        if(this == null) {
            return 0
        }
        return super.hashCode()
    }
}