require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: NoMatch
        event!: noMatch
        a: nomatch

    state: Match
        event!: match
        a: {{$context.intent.answer}}