import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_stuck-at-file-uploading-step-please-help'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/stuck-at-file-uploading-step-please-help/9716')

'step 2: Add visual checkpoint at Page_t_stuck-at-file-uploading-step-please-help'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00573_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
