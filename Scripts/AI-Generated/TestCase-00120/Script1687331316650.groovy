import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_stale-element-reference-element-is-not-attached-to-the-page-document'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/stale-element-reference-element-is-not-attached-to-the-page-document/10072')

'step 2: Add visual checkpoint at Page_t_stale-element-reference-element-is-not-attached-to-the-page-document'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00120_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
