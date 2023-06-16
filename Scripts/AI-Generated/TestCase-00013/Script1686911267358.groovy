import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-create-a-katalon-method-keyword-for-writing-to-a-text-file-with-java'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-create-a-katalon-method-keyword-for-writing-to-a-text-file-with-java/28807')

'step 2: Add visual checkpoint at Page_t_how-to-create-a-katalon-method-keyword-for-writing-to-a-text-file-with-java'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00013_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
