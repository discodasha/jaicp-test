require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.czxcccxzczxcxzc

    state: NoMatch
        event!: noMatch
        a: nomatch

    state: Match
        event!: match
        a: {{$context.intent.answer}}