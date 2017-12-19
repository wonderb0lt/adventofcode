package lt.wonderb0.advent.day5

// TODO: Functional version? Tests? Does only work for the sample set?
class InstructionProcessor(instructions: Seq[Int]) {
  private val maxCycles = 10000000
  private val offsets = collection.mutable.Map[Int, Int]().withDefault(i => i)

  def execute(): Int = {
    var stackPointer = 0
    var cycles = 0
    while (cycles < maxCycles && stackPointer < instructions.size) {
      val instruction = instructions(stackPointer)
      stackPointer += offsets(instruction)
      offsets(instruction) = instruction + 1
      cycles += 1

    }

    cycles
  }

}

object InstructionProcessor {
  def main(args: Array[String]): Unit = {
    println(new InstructionProcessor(InstructionSet()).execute())
  }
}
