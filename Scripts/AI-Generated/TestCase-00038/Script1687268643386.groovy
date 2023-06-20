import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/23504/2')

'step 2: At Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-2 click on blockquote_quote_id_23373_5_0'

testObj = findTestObject('Object Repository/Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/blockquote_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-2 click on blockquote_quote_id_23373_5_0'

testObj = findTestObject('Object Repository/Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/blockquote_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-2 click on p_object --> navigate to Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-4'

testObj = findTestObject('Object Repository/Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-use-global-variables-between-test-suites-while-executing-test-suite-collection/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_t_how-to-use-global-variables-between-test-suites-while-executing-test-suite-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00038_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
