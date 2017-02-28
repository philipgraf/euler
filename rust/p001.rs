fn main() {
  let sum = (1..1000)
      .filter(|&x| x % 3 == 0 || x % 5 == 0)
      .fold(0, |sum, i| sum + i);
  println!("{}", sum)
}
