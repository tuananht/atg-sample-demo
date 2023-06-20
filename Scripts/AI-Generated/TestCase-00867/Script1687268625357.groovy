import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_need-help-please-cannot-get-upload-pack-while-trying-to-pull-from-git-sometimes-the-error-changes-to-conflict-while-pull'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/need-help-please-cannot-get-upload-pack-while-trying-to-pull-from-git-sometimes-the-error-changes-to-conflict-while-pull/32989')

'step 2: Add visual checkpoint at Page_t_need-help-please-cannot-get-upload-pack-while-trying-to-pull-from-git-sometimes-the-error-changes-to-conflict-while-pull'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00867_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
