import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-ini-should-speciify-dfile-encoding-utf-8'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-ini-should-speciify-dfile-encoding-utf-8/24676')

'step 2: At Page_t_katalon-ini-should-speciify-dfile-encoding-utf-8 click on hyperlink_europe1_discourse_759a0957aeee1754e0e4f'

testObj = findTestObject('Object Repository/Page_t/hyperlink_object_12')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_katalon-ini-should-speciify-dfile-encoding-utf-8'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00010_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
