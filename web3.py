contract ModelLogger {
    mapping(uint => bytes) public modelWeights;
    uint public modelCount;
    
    function logWeights(bytes memory weights) public {
        modelWeights[modelCount] = weights;
        modelCount++;
    }
}