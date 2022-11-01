class CreateBlockChain {
    var blocks: MutableList<Block> = mutableListOf()
    private val genesisBlock = Block(previousHash = "0", data = "First Block")
        fun createBlock(message:String){
            blocks.add(Block(genesisBlock.hash,"$message"))
        }
    }
