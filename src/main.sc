require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнёмx

    state: NoMatch
        event!: noMatch
        a: nomatchsdasdasd

    state: Match
        event!: match
        a: {{$context.intent.answer}}