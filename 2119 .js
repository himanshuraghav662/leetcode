/**
 * @param {number} num
 * @return {boolean}
 */
var isSameAfterReversals = function(num) {
     if (!num) return true;            
    return (num%10 !== 0)
};
