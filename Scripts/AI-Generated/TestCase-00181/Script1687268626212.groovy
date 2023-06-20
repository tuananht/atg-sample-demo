import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-xpath-for-the-url-is-correct-but-not-visible-if-added-via-addproperty'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-xpath-for-the-url-is-correct-but-not-visible-if-added-via-addproperty/11662')

'step 2: Add visual checkpoint at Page_t_the-xpath-for-the-url-is-correct-but-not-visible-if-added-via-addproperty'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00181_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
