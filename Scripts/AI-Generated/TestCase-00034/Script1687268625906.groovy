import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/83934')

'step 2: At Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case click on p_object'

testObj = findTestObject('Object Repository/Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case click on p_object'

testObj = findTestObject('Object Repository/Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case click on p_object'

testObj = findTestObject('Object Repository/Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_t_how-to-save-a-local-variable-test-case-variable-as-a-global-variable-so-that-it-can-be-used-in-another-test-case'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00034_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
