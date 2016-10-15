/**
 * <p>转码工具 </p>
 *
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期            修改人            修改内容
 * </PRE>
 *
 * @author lvxz5
 * @since 1.0
 * @version 1.0
 * @date 2016/10/14
 */
var Transcoding = typeof(transcoding) != "undefined" ? transcoding : {};



/**
 * unicode转中文
 */
Transcoding.u2h = function (text) {
    text = text.trim();
    // text = text.replace(/\u/g,"");
    return GB2312UnicodeConverter.ToGB2312(text);
}

/**
 *中文转unicode
 */
Transcoding.h2u = function (text) {
    text = text.trim();
    // text = text.replace(/\u/g,"");
    return GB2312UnicodeConverter.ToUnicode(text);
}

/**
 * 中文字符转英文字符
 * @param str
 * @returns {string}
 * @constructor
 */
Transcoding.CnCode2EnCode = function (str) {
    var tmp = '';
    for (var i = 0; i < str.length; i++) {
        tmp += String.fromCharCode(str.charCodeAt(i) + 65248)
    }
    return tmp
}






















var GB2312UnicodeConverter = typeof(GB2312UnicodeConverter) != "undefined" ? GB2312UnicodeConverter : {};


GB2312UnicodeConverter.ToUnicode = function (str) {
    var txt = escape(str).toLocaleLowerCase().replace(/%u/gi, '\\u');
    //var txt= escape(str).replace(/([%3F]+)/gi,'\\u');
    return txt.replace(/%7b/gi, '{').replace(/%7d/gi, '}').replace(/%3a/gi, ':').replace(/%2c/gi, ',').replace(/%27/gi, '\'').replace(/%22/gi, '"').replace(/%5b/gi, '[').replace(/%5d/gi, ']').replace(/%3D/gi, '=').replace(/%20/gi, ' ').replace(/%3E/gi, '>').replace(/%3C/gi, '<').replace(/%3F/gi, '?').replace(/%5c/gi, '\\');//
}

GB2312UnicodeConverter.ToGB2312 = function (str) {
    return unescape(str.replace(/\\u/gi, '%u'));
}