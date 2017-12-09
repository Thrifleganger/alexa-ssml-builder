# alexa-ssml-builder

A fluid utility project for generating wellformed SSML output targeted towards Amaon's Alexa skill development.

### Issues to consider:

- The current functionality covers what root level ssml generation, similar to this:
```
<speak>
    Hello there.
    <emphasis level="strong">Wow</emphasis>, it's a cold day!
    Today is the <say-as interpret-as="date">20171209</say-as>.
</speak>
```
But we need to be able to make all these tags as inline snippets, while reusing previous code. We need to be able to do something like this:
```
<speak>
    <p>
        <s>Hello there.</s>
    </p>
    <p>
        <s><emphasis level="strong"><say-as interpret-as="spell-out">Wow</say-as></emphasis>, it's a cold day!</s>
        <s>Today is the <say-as interpret-as="date">20171209</say-as>.</s>
    </p>
</speak>
```

To test these out with a voice simulator, you need to have an amazon developer account.

- A user can provide input which can be malformed, such as '&' or '<' or '>'. We need to be able to check the user input for all these special characters. The problem is that quite a lot of functions take in user input as String value. Could all these functions be validated by a callback of sorts, rather than calling an isValid method in all of them?
