/**
 * Finnhub API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.finnhub.api.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param query Search query
 * @param isins List of isin to search, comma separated (Max: 50).
 * @param cusips List of cusip to search, comma separated (Max: 50).
 * @param ciks List of SEC Center Index Key to search, comma separated (Max: 50).
 * @param sedarIds List of SEDAR issuer number to search, comma separated (Max: 50).
 * @param chIds List of Companies House number to search, comma separated (Max: 50).
 * @param symbols List of symbols to search, comma separated (Max: 50).
 * @param sedols List of sedols to search, comma separated (Max: 50).
 * @param sources List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @param forms List of forms to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @param gics List of gics to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @param naics List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @param exhibits List of exhibits to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @param exchanges List of exchanges to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @param countries List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values.
 * @param acts List of SEC's exchanges act to search, comma separated. Look at <code>/filter</code> endpoint to see all available values.
 * @param caps List of market capitalization to search, comma separated. Look at <code>/filter</code> endpoint to see all available values.
 * @param fromDate Search from date in format: YYYY-MM-DD, default from the last 2 years
 * @param toDate Search to date in format: YYYY-MM-DD, default to today
 * @param page Use for pagination, default to page 1
 * @param sort Sort result by, default: sortMostRecent. Look at <code>/filter</code> endpoint to see all available values.
 * @param highlighted Enable highlight in returned filings. If enabled, only return 10 results each time
 */

data class SearchBody (

    /* Search query */
    @Json(name = "query")
    val query: kotlin.String,

    /* List of isin to search, comma separated (Max: 50). */
    @Json(name = "isins")
    val isins: kotlin.String? = null,

    /* List of cusip to search, comma separated (Max: 50). */
    @Json(name = "cusips")
    val cusips: kotlin.String? = null,

    /* List of SEC Center Index Key to search, comma separated (Max: 50). */
    @Json(name = "ciks")
    val ciks: kotlin.String? = null,

    /* List of SEDAR issuer number to search, comma separated (Max: 50). */
    @Json(name = "sedarIds")
    val sedarIds: kotlin.String? = null,

    /* List of Companies House number to search, comma separated (Max: 50). */
    @Json(name = "chIds")
    val chIds: kotlin.String? = null,

    /* List of symbols to search, comma separated (Max: 50). */
    @Json(name = "symbols")
    val symbols: kotlin.String? = null,

    /* List of sedols to search, comma separated (Max: 50). */
    @Json(name = "sedols")
    val sedols: kotlin.String? = null,

    /* List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "sources")
    val sources: kotlin.String? = null,

    /* List of forms to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "forms")
    val forms: kotlin.String? = null,

    /* List of gics to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "gics")
    val gics: kotlin.String? = null,

    /* List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "naics")
    val naics: kotlin.String? = null,

    /* List of exhibits to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "exhibits")
    val exhibits: kotlin.String? = null,

    /* List of exchanges to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "exchanges")
    val exchanges: kotlin.String? = null,

    /* List of sources to search, comma separated (Max: 50). Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "countries")
    val countries: kotlin.String? = null,

    /* List of SEC's exchanges act to search, comma separated. Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "acts")
    val acts: kotlin.String? = null,

    /* List of market capitalization to search, comma separated. Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "caps")
    val caps: kotlin.String? = null,

    /* Search from date in format: YYYY-MM-DD, default from the last 2 years */
    @Json(name = "fromDate")
    val fromDate: kotlin.String? = null,

    /* Search to date in format: YYYY-MM-DD, default to today */
    @Json(name = "toDate")
    val toDate: kotlin.String? = null,

    /* Use for pagination, default to page 1 */
    @Json(name = "page")
    val page: kotlin.String? = null,

    /* Sort result by, default: sortMostRecent. Look at <code>/filter</code> endpoint to see all available values. */
    @Json(name = "sort")
    val sort: kotlin.String? = null,

    /* Enable highlight in returned filings. If enabled, only return 10 results each time */
    @Json(name = "highlighted")
    val highlighted: kotlin.Boolean? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}
