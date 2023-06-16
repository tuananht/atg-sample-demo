import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-write-katalon-studio-tests-with-intellij-idea-and-other-ides'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-write-katalon-studio-tests-with-intellij-idea-and-other-ides/15940')

'step 2: At Page_t_how-to-write-katalon-studio-tests-with-intellij-idea-and-other-ides click on div_ember4 --> navigate to Page_t_getting-invalid-test-case-s-while-adding-ado-test-case-id-variable'

testObj = findTestObject('Object Repository/Page_t_how-to-write-katalon-studio-tests-with-intellij-idea-and-other-ides/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-write-katalon-studio-tests-with-intellij-idea-and-other-ides/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_getting-invalid-test-case-s-while-adding-ado-test-case-id-variable'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00000_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
